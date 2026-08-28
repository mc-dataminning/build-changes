import com.mojang.serialization.MapCodec;

public abstract class dix extends dke {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fcm h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fcm b = fcj.a(
      fcj.b(), fcj.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbw.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends dix> a();

   public dix(dxm.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dxn $$0) {
      return 0.0;
   }

   protected boolean a(dxn $$0, jh $$1, bvf $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   public abstract boolean d(dxn var1);

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      jh $$4 = dpy.a((dha)$$1, $$2);
      if ($$4 != null) {
         eto $$5 = dpy.a($$1, $$4);
         if ($$5 != etq.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eto $$0) {
      return false;
   }

   protected void a(dxn $$0, dha $$1, jh $$2, eto $$3) {
   }
}
