import java.util.Optional;

public class csi extends cwd implements csm, czl {
   private static final dfp e = dfo.C;
   private static final int f = 6;
   protected static final ehy a = csk.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ehy b = csk.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ehy c = csk.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ehy d = csk.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected csi(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, hb.c));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(aC)) {
         case d:
            return b;
         case c:
         default:
            return a;
         case e:
            return d;
         case f:
            return c;
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(e) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      dey $$4 = $$1.a_($$3);
      dey $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apj.bx)) && ($$5.a(this) || $$5.a(csl.rC));
   }

   protected static boolean a(cpl $$0, gv $$1, eab $$2, hb $$3) {
      dey $$4 = csl.rD.n().a(e, Boolean.valueOf($$2.a(eac.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (($$1 == hb.a || $$1 == hb.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      Optional<gv> $$3 = l.a($$0, $$1, $$2.b(), hb.b, csl.rC);
      if (!$$3.isPresent()) {
         return false;
      } else {
         gv $$4 = $$3.get().c();
         dey $$5 = $$0.a_($$4);
         return csh.a((cpm)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      Optional<gv> $$4 = l.a($$0, $$2, $$3.b(), hb.b, csl.rC);
      if ($$4.isPresent()) {
         gv $$5 = $$4.get();
         gv $$6 = $$5.c();
         hb $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         csh.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(csl.rC);
   }
}
