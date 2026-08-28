import org.lwjgl.openal.AL10;

public class fgq {
   private float a = 1.0F;
   private fgr b = fgr.a;

   public void a(fgr $$0) {
      this.b = $$0;
      fei $$1 = $$0.b();
      fei $$2 = $$0.c();
      fei $$3 = $$0.d();
      AL10.alListener3f(4100, (float)$$1.d, (float)$$1.e, (float)$$1.f);
      AL10.alListenerfv(4111, new float[]{(float)$$2.d, (float)$$2.e, (float)$$2.f, (float)$$3.a(), (float)$$3.b(), (float)$$3.c()});
   }

   public void a(float $$0) {
      AL10.alListenerf(4106, $$0);
      this.a = $$0;
   }

   public float a() {
      return this.a;
   }

   public void b() {
      this.a(fgr.a);
   }

   public fgr c() {
      return this.b;
   }
}
