import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dbd {
   private static final Logger c = LogUtils.getLogger();
   public static final dbd a = new dbd(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dbd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dvv.a.c, dyc.c.promotePartial(ac.a("Carver: ", c::error)), ayt.a(dvv.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eft.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dbd::new)
   );
   private final Map<dvv.a, ja<dyc<?>>> d;
   private final List<ja<eft>> e;
   private final Supplier<List<dyq<?, ?>>> f;
   private final Supplier<Set<eft>> g;

   dbd(Map<dvv.a, ja<dyc<?>>> $$0, List<ja<eft>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ja::a).map(iw::a).flatMap(eft::a).filter($$0xx -> $$0xx.b() == dzd.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ja::a).map(iw::a).collect(Collectors.toSet()));
   }

   public Iterable<iw<dyc<?>>> a(dvv.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dyq<?, ?>> a() {
      return this.f.get();
   }

   public List<ja<eft>> b() {
      return this.e;
   }

   public boolean a(eft $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dbd.b {
      private final ix<eft> a;
      private final ix<dyc<?>> b;

      public a(ix<eft> $$0, ix<dyc<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dbd.a a(dvv.b $$0, akg<eft> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dbd.a a(dvv.a $$0, akg<dyc<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dvv.a, List<iw<dyc<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<iw<eft>>> b = Lists.newArrayList();

      public dbd.b a(dvv.b $$0, iw<eft> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dbd.b a(int $$0, iw<eft> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dbd.b a(dvv.a $$0, iw<dyc<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dbd a() {
         return new dbd(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ja.a((List)$$0.getValue()))),
            this.b.stream().map(ja::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
