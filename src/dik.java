import com.mojang.serialization.MapCodec;

public class dik extends dfi implements dlp {
   public static final MapCodec<dik> a = b(dik::new);
   protected static final exp b = dfw.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   protected dik(dsz.d $$0) {
      super($$0);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drx($$0, $$1);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3.cx() && exm.c(exm.a($$3.cL().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), exa.i)) {
         if (!$$1.B && $$1.af() == dcu.j && $$3 instanceof aqu $$4 && !$$4.f) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public epw a(aqt $$0, bsq $$1, jd $$2) {
      akp<dcu> $$3 = $$0.af() == dcu.j ? dcu.h : dcu.j;
      aqt $$4 = $$0.o().a($$3);
      boolean $$5 = $$3 == dcu.j;
      jd $$6 = $$5 ? aqt.a : $$4.V();
      eww $$7 = new eww((double)$$6.u() + 0.5, (double)$$6.v(), (double)$$6.w() + 0.5);
      if ($$5) {
         this.a($$4, jd.a((jw)$$7).d());
      } else {
         if ($$1 instanceof aqu $$8) {
            return $$8.a(false);
         }

         int $$9 = $$4.m($$6).a(dyv.a.f, $$6.u(), $$6.w()) + 1;
         $$7 = new eww($$7.c, (double)$$9, $$7.e);
      }

      return new epw($$4, $$7, $$1.dt(), $$1.dG(), $$1.dI());
   }

   private void a(aqt $$0, jd $$1) {
      jd.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dta $$6 = $$5 == -1 ? dfy.co.o() : dfy.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lm.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return cuo.l;
   }

   @Override
   protected boolean a(dta $$0, eox $$1) {
      return false;
   }
}
