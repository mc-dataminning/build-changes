import org.lwjgl.openal.AL10;

public class fge {
   private float a = 1.0F;
   private fgf b = fgf.a;

   public void a(fgf $$0) {
      this.b = $$0;
      fdw $$1 = $$0.b();
      fdw $$2 = $$0.c();
      fdw $$3 = $$0.d();
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
      this.a(fgf.a);
   }

   public fgf c() {
      return this.b;
   }
}
