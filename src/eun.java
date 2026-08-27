import org.lwjgl.openal.AL10;

public class eun {
   private float a = 1.0F;
   private euo b = euo.a;

   public void a(euo $$0) {
      this.b = $$0;
      esj $$1 = $$0.b();
      esj $$2 = $$0.c();
      esj $$3 = $$0.d();
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
      this.a(euo.a);
   }

   public euo c() {
      return this.b;
   }
}
