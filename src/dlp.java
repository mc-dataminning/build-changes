import com.mojang.serialization.MapCodec;

public class dlp extends dhk {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final dtc b = dtb.s;
   public static final dtl e = dtb.aA;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (!$$3.gb().e) {
         return bqh.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bqh.a($$1.B);
      }
   }

   @Override
   protected int g(dsl $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !this.b($$3, $$5, $$2)) {
         return dfk.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dcj $$0, ja $$1, dsl $$2) {
      return this.a((dcw)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(d)) {
         jf $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(le.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, e, b, d);
   }
}
