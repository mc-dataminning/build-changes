import org.lwjgl.openal.AL10;

public class exu {
   private float a = 1.0F;
   private exv b = exv.a;

   public void a(exv $$0) {
      this.b = $$0;
      evq $$1 = $$0.b();
      evq $$2 = $$0.c();
      evq $$3 = $$0.d();
      AL10.alListener3f(4100, (float)$$1.c, (float)$$1.d, (float)$$1.e);
      AL10.alListenerfv(4111, new float[]{(float)$$2.c, (float)$$2.d, (float)$$2.e, (float)$$3.a(), (float)$$3.b(), (float)$$3.c()});
   }

   public void a(float $$0) {
      AL10.alListenerf(4106, $$0);
      this.a = $$0;
   }

   public float a() {
      return this.a;
   }

   public void b() {
      this.a(exv.a);
   }

   public exv c() {
      return this.b;
   }
}
