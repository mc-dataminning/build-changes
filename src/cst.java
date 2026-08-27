import java.util.Optional;

public class cst extends cwo implements csx, czw {
   private static final dga e = dfz.C;
   private static final int f = 6;
   protected static final eig a = csv.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eig b = csv.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eig c = csv.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eig d = csv.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected cst(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, ha.c));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((ha)$$0.c(aC)) {
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
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(e) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfj $$4 = $$1.a_($$3);
      dfj $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aps.bx)) && ($$5.a(this) || $$5.a(csw.rC));
   }

   protected static boolean a(cpw $$0, gw $$1, eam $$2, ha $$3) {
      dfj $$4 = csw.rD.n().a(e, Boolean.valueOf($$2.a(ean.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (($$1 == ha.a || $$1 == ha.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      Optional<gw> $$3 = l.a($$0, $$1, $$2.b(), ha.b, csw.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().c();
         dfj $$5 = $$0.a_($$4);
         return css.a((cpx)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      Optional<gw> $$4 = l.a($$0, $$2, $$3.b(), ha.b, csw.rC);
      if (!$$4.isEmpty()) {
         gw $$5 = $$4.get();
         gw $$6 = $$5.c();
         ha $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         css.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(csw.rC);
   }
}
