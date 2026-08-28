import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evb extends evj {
   public static final int a = 0;
   public static final MapCodec<evb> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbm.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  eye.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evb::new)
   );
   private final jp<dbm> c;
   private final eyd d;
   private final int e;

   evb(List<exh> $$0, jp<dbm> $$1, eyd $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evl<evb> b() {
      return evm.m;
   }

   @Override
   public Set<ewp<?>> a() {
      return Sets.union(ImmutableSet.of(ews.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      btz $$2 = $$1.c(ews.d);
      if ($$2 instanceof buv $$3) {
         int $$4 = dbo.a(this.c, $$3);
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

   public static evb.a a(jr.a $$0, eyd $$1) {
      jr.b<dbm> $$2 = $$0.d(ly.aM);
      return new evb.a($$2.b(dbr.s), $$1);
   }

   public static class a extends evj.a<evb.a> {
      private final jp<dbm> a;
      private final eyd b;
      private int c = 0;

      public a(jp<dbm> $$0, eyd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected evb.a a() {
         return this;
      }

      public evb.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public evk b() {
         return new evb(this.g(), this.a, this.b, this.c);
      }
   }
}
