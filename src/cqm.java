import javax.annotation.Nullable;

public class cqm extends cvy implements cwo {
   public static final dcs a = dcr.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final efb d = cpn.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final efb e = cpn.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final efb f = cpn.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public cqm(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, ha.a.b));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((ha.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dxe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == dxf.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(a) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
