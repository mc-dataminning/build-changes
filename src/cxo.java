import com.mojang.serialization.MapCodec;

public class cxo extends dae implements cwt, cxm {
   public static final MapCodec<cxo> c = b(cxo::new);

   @Override
   public MapCodec<cxo> a() {
      return c;
   }

   public cxo(djg.d $$0) {
      super($$0, ic.a, s_, false);
      this.k(this.E.b().a(t_, Boolean.valueOf(false)));
   }

   @Override
   protected daf c() {
      return (daf)cws.sv;
   }

   @Override
   protected djh a(djh $$0, djh $$1) {
      return $$1.a(t_, $$0.c(t_));
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
