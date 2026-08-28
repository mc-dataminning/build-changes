import org.lwjgl.openal.AL10;

public class fhg {
   private float a = 1.0F;
   private fhh b = fhh.a;

   public void a(fhh $$0) {
      this.b = $$0;
      fex $$1 = $$0.b();
      fex $$2 = $$0.c();
      fex $$3 = $$0.d();
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
      this.a(fhh.a);
   }

   public fhh c() {
      return this.b;
   }
}
