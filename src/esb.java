import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esb extends esj {
   public static final int a = 0;
   public static final MapCodec<esb> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  czm.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  eve.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esb::new)
   );
   private final jj<czm> c;
   private final evd d;
   private final int e;

   esb(List<euh> $$0, jj<czm> $$1, evd $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esl<esb> b() {
      return esm.m;
   }

   @Override
   public Set<etp<?>> a() {
      return Sets.union(ImmutableSet.of(ets.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      bsh $$2 = $$1.c(ets.d);
      if ($$2 instanceof btc $$3) {
         int $$4 = czo.a(this.c, $$3);
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

   public static esb.a a(jl.a $$0, evd $$1) {
      jl.b<czm> $$2 = $$0.b(lr.aK);
      return new esb.a($$2.b(czr.s), $$1);
   }

   public static class a extends esj.a<esb.a> {
      private final jj<czm> a;
      private final evd b;
      private int c = 0;

      public a(jj<czm> $$0, evd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected esb.a a() {
         return this;
      }

      public esb.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public esk b() {
         return new esb(this.g(), this.a, this.b, this.c);
      }
   }
}
