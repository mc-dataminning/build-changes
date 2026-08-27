import com.mojang.serialization.MapCodec;

public class dbc extends cya {
   public static final MapCodec<dbc> a = b(dbc::new);
   protected static final eol b = cyo.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   protected dbc(dle.d $$0) {
      super($$0);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkj($$0, $$1);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$1 instanceof aov && $$3.ct() && eoi.c(eoi.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), enw.i)) {
         aix<cvn> $$4 = $$1.ae() == cvn.j ? cvn.h : cvn.j;
         aov $$5 = ((aov)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jz.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return coz.h;
   }

   @Override
   protected boolean a(dlf $$0, ego $$1) {
      return false;
   }
}
