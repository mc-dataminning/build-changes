import com.mojang.serialization.MapCodec;

public class cxw extends dam implements cxb, cxu {
   public static final MapCodec<cxw> c = b(cxw::new);

   @Override
   public MapCodec<cxw> a() {
      return c;
   }

   public cxw(djo.d $$0) {
      super($$0, ic.a, t_, false);
      this.k(this.E.b().a(u_, Boolean.valueOf(false)));
   }

   @Override
   protected dan c() {
      return (dan)cxa.sv;
   }

   @Override
   protected djp a(djp $$0, djp $$1) {
      return $$1.a(u_, $$0.c(u_));
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cnj.wm);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      return cxu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(u_);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return !$$2.c(u_);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      $$0.a($$2, $$3.a(u_, Boolean.valueOf(true)), 2);
   }
}
