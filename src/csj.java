import java.util.Optional;

public class csj extends cwe implements csn, czm {
   private static final dfq e = dfp.C;
   private static final int f = 6;
   protected static final ehw a = csl.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ehw b = csl.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ehw c = csl.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ehw d = csl.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected csj(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, ha.c));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
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
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(e) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      dez $$4 = $$1.a_($$3);
      dez $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apl.bx)) && ($$5.a(this) || $$5.a(csm.rC));
   }

   protected static boolean a(cpm $$0, gu $$1, eac $$2, ha $$3) {
      dez $$4 = csm.rD.n().a(e, Boolean.valueOf($$2.a(ead.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (($$1 == ha.a || $$1 == ha.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      Optional<gu> $$3 = l.a($$0, $$1, $$2.b(), ha.b, csm.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gu $$4 = $$3.get().c();
         dez $$5 = $$0.a_($$4);
         return csi.a((cpn)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      Optional<gu> $$4 = l.a($$0, $$2, $$3.b(), ha.b, csm.rC);
      if (!$$4.isEmpty()) {
         gu $$5 = $$4.get();
         gu $$6 = $$5.c();
         ha $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         csi.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(csm.rC);
   }
}
