import com.mojang.serialization.MapCodec;

public class cxv extends dan implements cxb, cxu {
   public static final MapCodec<cxv> c = b(cxv::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cxv> a() {
      return c;
   }

   public cxv(djo.d $$0) {
      super($$0, ic.a, t_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(u_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(auw $$0) {
      return 1;
   }

   @Override
   protected boolean g(djp $$0) {
      return $$0.i();
   }

   @Override
   protected cwy b() {
      return cxa.sw;
   }

   @Override
   protected djp a(djp $$0, djp $$1) {
      return $$1.a(u_, $$0.c(u_));
   }

   @Override
   protected djp a(djp $$0, auw $$1) {
      return super.a($$0, $$1).a(u_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
