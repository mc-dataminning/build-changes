import org.lwjgl.openal.AL10;

public class fdi {
   private float a = 1.0F;
   private fdj b = fdj.a;

   public void a(fdj $$0) {
      this.b = $$0;
      fba $$1 = $$0.b();
      fba $$2 = $$0.c();
      fba $$3 = $$0.d();
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
      this.a(fdj.a);
   }

   public fdj c() {
      return this.b;
   }
}
