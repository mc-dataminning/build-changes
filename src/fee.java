import org.lwjgl.openal.AL10;

public class fee {
   private float a = 1.0F;
   private fef b = fef.a;

   public void a(fef $$0) {
      this.b = $$0;
      fbx $$1 = $$0.b();
      fbx $$2 = $$0.c();
      fbx $$3 = $$0.d();
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
      this.a(fef.a);
   }

   public fef c() {
      return this.b;
   }
}
