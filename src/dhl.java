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

public class dhl {
   private static final Logger c = LogUtils.getLogger();
   public static final dhl a = new dhl(jv.a(), List.of());
   public static final MapCodec<dhl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eew.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               emq.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dhl::new)
   );
   private final jv<eew<?>> d;
   private final List<jv<emq>> e;
   private final Supplier<List<efk<?, ?>>> f;
   private final Supplier<Set<emq>> g;

   dhl(jv<eew<?>> $$0, List<jv<emq>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jv::a).map(jr::a).flatMap(emq::a).filter($$0xx -> $$0xx.b() == efy.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jv::a).map(jr::a).collect(Collectors.toSet()));
   }

   public Iterable<jr<eew<?>>> a() {
      return this.d;
   }

   public List<efk<?, ?>> b() {
      return this.f.get();
   }

   public List<jv<emq>> c() {
      return this.e;
   }

   public boolean a(emq $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dhl.b {
      private final js<emq> a;
      private final js<eew<?>> b;

      public a(js<emq> $$0, js<eew<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dhl.a a(eco.a $$0, aku<emq> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dhl.a a(aku<eew<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jr<eew<?>>> a = new ArrayList<>();
      private final List<List<jr<emq>>> b = new ArrayList<>();

      public dhl.b a(eco.a $$0, jr<emq> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dhl.b a(int $$0, jr<emq> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dhl.b a(jr<eew<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dhl a() {
         return new dhl(jv.a(this.a), this.b.stream().map(jv::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
