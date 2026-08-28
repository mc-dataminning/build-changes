import org.lwjgl.openal.AL10;

public class fbm {
   private float a = 1.0F;
   private fbn b = fbn.a;

   public void a(fbn $$0) {
      this.b = $$0;
      ezh $$1 = $$0.b();
      ezh $$2 = $$0.c();
      ezh $$3 = $$0.d();
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
      this.a(fbn.a);
   }

   public fbn c() {
      return this.b;
   }
}
