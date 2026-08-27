import javax.annotation.Nullable;

public class ctc extends cpn implements cwo {
   private static final dcs b = dcr.C;
   protected static final efb a = cpn.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected ctc(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(b) ? dxf.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = super.a($$0);
      if ($$1 != null) {
         dxe $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == dxf.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.c();
      dcb $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ha.a);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
         return cpo.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
