import com.mojang.serialization.MapCodec;

public class cxn extends daf implements cwt, cxm {
   public static final MapCodec<cxn> c = b(cxn::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cxn> a() {
      return c;
   }

   public cxn(djg.d $$0) {
      super($$0, ic.a, s_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(auv $$0) {
      return 1;
   }

   @Override
   protected boolean g(djh $$0) {
      return $$0.i();
   }

   @Override
   protected cwq b() {
      return cws.sw;
   }

   @Override
   protected djh a(djh $$0, djh $$1) {
      return $$1.a(t_, $$0.c(t_));
   }

   @Override
   protected djh a(djh $$0, auv $$1) {
      return super.a($$0, $$1).a(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cnb.wj);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      return cxm.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      $$0.a($$2, $$3.a(t_, Boolean.valueOf(true)), 2);
   }
}
