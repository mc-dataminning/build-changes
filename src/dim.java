import com.mojang.serialization.MapCodec;

public class dim extends dfk implements dlr {
   public static final MapCodec<dim> a = b(dim::new);
   protected static final ext b = dfy.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   protected dim(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drz($$0, $$1);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3.cx() && exq.c(exq.a($$3.cL().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), exe.i)) {
         if (!$$1.B && $$1.af() == dcw.j && $$3 instanceof aqv $$4 && !$$4.f) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eqa a(aqu $$0, bsr $$1, jd $$2) {
      akq<dcw> $$3 = $$0.af() == dcw.j ? dcw.h : dcw.j;
      aqu $$4 = $$0.o().a($$3);
      boolean $$5 = $$3 == dcw.j;
      jd $$6 = $$5 ? aqu.a : $$4.V();
      exa $$7 = $$6.c();
      if ($$5) {
         this.a($$4, jd.a((jw)$$7).e());
         if ($$1 instanceof aqv) {
            $$7 = $$7.a(0.0, 1.0, 0.0);
         }
      } else {
         if ($$1 instanceof aqv $$8) {
            return $$8.a(false, eqa.a);
         }

         $$7 = $$1.a($$4, $$6).c();
      }

      return new eqa($$4, $$7, $$1.ds(), $$1.dF(), $$1.dH(), eqa.c);
   }

   private void a(aqu $$0, jd $$1) {
      jd.a $$2 = $$1.k();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               jd $$6 = $$2.g($$1).e($$4, $$5, $$3);
               dfy $$7 = $$5 == -1 ? dga.co : dga.a;
               if (!$$0.a_($$6).a($$7)) {
                  $$0.a($$6, true, null);
                  $$0.b($$6, $$7.o());
               }
            }
         }
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lm.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return cuq.l;
   }

   @Override
   protected boolean a(dtc $$0, epb $$1) {
      return false;
   }
}
