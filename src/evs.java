import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evs extends ewa {
   public static final int a = 0;
   public static final MapCodec<evs> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dcd.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  eyv.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evs::new)
   );
   private final jq<dcd> c;
   private final eyu d;
   private final int e;

   evs(List<exy> $$0, jq<dcd> $$1, eyu $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public ewc<evs> b() {
      return ewd.m;
   }

   @Override
   public Set<exg<?>> a() {
      return Sets.union(ImmutableSet.of(exj.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      bul $$2 = $$1.c(exj.d);
      if ($$2 instanceof bvh $$3) {
         int $$4 = dcf.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static evs.a a(js.a $$0, eyu $$1) {
      js.b<dcd> $$2 = $$0.d(ma.aM);
      return new evs.a($$2.b(dci.s), $$1);
   }

   public static class a extends ewa.a<evs.a> {
      private final jq<dcd> a;
      private final eyu b;
      private int c = 0;

      public a(jq<dcd> $$0, eyu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected evs.a a() {
         return this;
      }

      public evs.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public ewb b() {
         return new evs(this.g(), this.a, this.b, this.c);
      }
   }
}
