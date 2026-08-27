import javax.annotation.Nullable;

public class crl extends cvc {
   public static final dfs a = cwd.aC;
   private static final ehy b = csk.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ehy c = csk.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ehy d = csk.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ehy e = csk.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ehy f = csk.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ehy g = csk.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ehy h = csk.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ehy i = ehv.a(b, c, d, e);
   private static final ehy j = ehv.a(b, f, g, h);
   private static final te k = te.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public crl(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c));
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(ape.aC);
         return bgo.b;
      }
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      return new bgw(($$2x, $$3, $$4) -> new cee($$2x, $$3, cen.a($$1, $$2)), k);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      hb $$4 = $$0.c(a);
      return $$4.o() == hb.a.a ? i : j;
   }

   @Override
   protected void a(byd $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, dey $$3, byd $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, byd $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhe a(big $$0) {
      return $$0.dL().b($$0);
   }

   @Nullable
   public static dey e(dey $$0) {
      if ($$0.a(csl.gS)) {
         return csl.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csl.gT) ? csl.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public int d(dey $$0, coq $$1, gv $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
