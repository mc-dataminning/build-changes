import com.mojang.serialization.MapCodec;

public class cze extends cwc {
   public static final MapCodec<cze> a = b(cze::new);
   protected static final emm b = cwq.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   protected cze(djg.d $$0) {
      super($$0);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dil($$0, $$1);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if ($$1 instanceof and && $$3.ct() && emj.c(emj.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), elx.i)) {
         ahf<ctp> $$4 = $$1.ae() == ctp.j ? ctp.h : ctp.j;
         and $$5 = ((and)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return cmy.f;
   }

   @Override
   public boolean a(djh $$0, eeq $$1) {
      return false;
   }
}
