import org.lwjgl.openal.AL10;

public class fby {
   private float a = 1.0F;
   private fbz b = fbz.a;

   public void a(fbz $$0) {
      this.b = $$0;
      ezr $$1 = $$0.b();
      ezr $$2 = $$0.c();
      ezr $$3 = $$0.d();
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
      this.a(fbz.a);
   }

   public fbz c() {
      return this.b;
   }
}
