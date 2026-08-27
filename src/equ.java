import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class equ extends eqq {
   public static final int a = 0;
   public static final MapCodec<equ> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eth.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, equ::new)
   );
   private final etg c;
   private final int d;

   equ(List<esl> $$0, etg $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eqs b() {
      return eqt.l;
   }

   @Override
   public Set<eru<?>> a() {
      return Sets.union(ImmutableSet.of(erx.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      bru $$2 = $$1.c(erx.d);
      if ($$2 instanceof bso) {
         int $$3 = cza.h((bso)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.I() > this.d) {
            $$0.e(this.d);
         }
      }

      return $$0;
   }

   public static equ.a a(etg $$0) {
      return new equ.a($$0);
   }

   public static class a extends eqq.a<equ.a> {
      private final etg a;
      private int b = 0;

      public a(etg $$0) {
         this.a = $$0;
      }

      protected equ.a a() {
         return this;
      }

      public equ.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eqr b() {
         return new equ(this.g(), this.a, this.b);
      }
   }
}
