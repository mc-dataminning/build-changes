import com.mojang.serialization.MapCodec;

public class czd extends cwb {
   public static final MapCodec<czd> a = b(czd::new);
   protected static final eml b = cwp.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   protected czd(djf.d $$0) {
      super($$0);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dik($$0, $$1);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$1 instanceof and && $$3.ct() && emi.c(emi.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), elw.i)) {
         ahf<cto> $$4 = $$1.ae() == cto.j ? cto.h : cto.j;
         and $$5 = ((and)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return cmx.f;
   }

   @Override
   public boolean a(djg $$0, eep $$1) {
      return false;
   }
}
