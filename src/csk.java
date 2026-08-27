import java.util.Optional;

public class csk extends cwf implements cso, czn {
   private static final dfr e = dfq.C;
   private static final int f = 6;
   protected static final ehx a = csm.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ehx b = csm.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ehx c = csm.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ehx d = csm.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected csk(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, ha.c));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(e) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dfa $$4 = $$1.a_($$3);
      dfa $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apl.bx)) && ($$5.a(this) || $$5.a(csn.rC));
   }

   protected static boolean a(cpn $$0, gu $$1, ead $$2, ha $$3) {
      dfa $$4 = csn.rD.n().a(e, Boolean.valueOf($$2.a(eae.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (($$1 == ha.a || $$1 == ha.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      Optional<gu> $$3 = l.a($$0, $$1, $$2.b(), ha.b, csn.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gu $$4 = $$3.get().c();
         dfa $$5 = $$0.a_($$4);
         return csj.a((cpo)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      Optional<gu> $$4 = l.a($$0, $$2, $$3.b(), ha.b, csn.rC);
      if (!$$4.isEmpty()) {
         gu $$5 = $$4.get();
         gu $$6 = $$5.c();
         ha $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         csj.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(csn.rC);
   }
}
