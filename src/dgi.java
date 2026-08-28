import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dgi {
   private static final Logger c = LogUtils.getLogger();
   public static final dgi a = new dgi(ju.a(), List.of());
   public static final MapCodec<dgi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edn.c.promotePartial(ae.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               elf.d.promotePartial(ae.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dgi::new)
   );
   private final ju<edn<?>> d;
   private final List<ju<elf>> e;
   private final Supplier<List<eeb<?, ?>>> f;
   private final Supplier<Set<elf>> g;

   dgi(ju<edn<?>> $$0, List<ju<elf>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ju::a).map(jq::a).flatMap(elf::a).filter($$0xx -> $$0xx.b() == eep.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ju::a).map(jq::a).collect(Collectors.toSet()));
   }

   public Iterable<jq<edn<?>>> a() {
      return this.d;
   }

   public List<eeb<?, ?>> b() {
      return this.f.get();
   }

   public List<ju<elf>> c() {
      return this.e;
   }

   public boolean a(elf $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dgi.b {
      private final jr<elf> a;
      private final jr<edn<?>> b;

      public a(jr<elf> $$0, jr<edn<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dgi.a a(ebf.a $$0, alk<elf> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dgi.a a(alk<edn<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jq<edn<?>>> a = new ArrayList<>();
      private final List<List<jq<elf>>> b = new ArrayList<>();

      public dgi.b a(ebf.a $$0, jq<elf> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dgi.b a(int $$0, jq<elf> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dgi.b a(jq<edn<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dgi a() {
         return new dgi(ju.a(this.a), this.b.stream().map(ju::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
