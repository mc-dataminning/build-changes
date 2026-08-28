import org.lwjgl.openal.AL10;

public class fdh {
   private float a = 1.0F;
   private fdi b = fdi.a;

   public void a(fdi $$0) {
      this.b = $$0;
      faz $$1 = $$0.b();
      faz $$2 = $$0.c();
      faz $$3 = $$0.d();
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
      this.a(fdi.a);
   }

   public fdi c() {
      return this.b;
   }
}
