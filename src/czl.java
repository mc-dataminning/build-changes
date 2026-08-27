import com.mojang.serialization.MapCodec;

public class czl extends dcd implements cyr, czk {
   public static final MapCodec<czl> c = b(czl::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<czl> a() {
      return c;
   }

   public czl(dle.d $$0) {
      super($$0, ie.a, t_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(u_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(awo $$0) {
      return 1;
   }

   @Override
   protected boolean g(dlf $$0) {
      return $$0.i();
   }

   @Override
   protected cyo b() {
      return cyq.sw;
   }

   @Override
   protected dlf a(dlf $$0, dlf $$1) {
      return $$1.a(u_, $$0.c(u_));
   }

   @Override
   protected dlf a(dlf $$0, awo $$1) {
      return super.a($$0, $$1).a(u_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cpc.wm);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      return czk.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(u_);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return !$$2.c(u_);
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      $$0.a($$2, $$3.a(u_, Boolean.valueOf(true)), 2);
   }
}
