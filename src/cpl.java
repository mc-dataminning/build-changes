import java.util.Optional;

public class cpl extends ctg implements cpp, cwo {
   private static final dcs e = dcr.C;
   private static final int f = 6;
   protected static final efb a = cpn.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final efb b = cpn.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final efb c = cpn.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final efb d = cpn.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected cpl(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, ha.c));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
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
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(e) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dcb $$4 = $$1.a_($$3);
      dcb $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(amw.bv)) && ($$5.a(this) || $$5.a(cpo.rC));
   }

   protected static boolean a(cmn $$0, gu $$1, dxe $$2, ha $$3) {
      dcb $$4 = cpo.rD.n().a(e, Boolean.valueOf($$2.a(dxf.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if (($$1 == ha.a || $$1 == ha.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      Optional<gu> $$4 = l.a($$0, $$1, $$2.b(), ha.b, cpo.rC);
      if (!$$4.isPresent()) {
         return false;
      } else {
         gu $$5 = $$4.get().c();
         dcb $$6 = $$0.a_($$5);
         return cpk.a($$0, $$5, $$6);
      }
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      Optional<gu> $$4 = l.a($$0, $$2, $$3.b(), ha.b, cpo.rC);
      if ($$4.isPresent()) {
         gu $$5 = $$4.get();
         gu $$6 = $$5.c();
         ha $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         cpk.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(cpo.rC);
   }
}
