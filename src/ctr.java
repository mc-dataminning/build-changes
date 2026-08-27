import javax.annotation.Nullable;

public class ctr extends cpn implements cwo {
   public static final dcs a = dcr.j;
   public static final dcs b = dcr.C;
   protected static final efb c = eey.a(cpn.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cpn.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final efb d = eey.a(cpn.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cpn.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public ctr(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());

      for (ha $$2 : $$0.f()) {
         if ($$2.o() == ha.a.b) {
            dcb $$3 = this.n().a(a, Boolean.valueOf($$2 == ha.b));
            if ($$3.a((cmp)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == dxf.c));
            }
         }
      }

      return null;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = h($$0).g();
      return cpn.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ha h(dcb $$0) {
      return $$0.c(a) ? ha.a : ha.b;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(b) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
