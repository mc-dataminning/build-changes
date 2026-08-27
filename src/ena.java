import org.joml.Vector3f;
import org.lwjgl.openal.AL10;

public class ena {
   private float a = 1.0F;
   private elb b;

   public ena() {
      this.b = elb.b;
   }

   public void a(elb $$0) {
      this.b = $$0;
      AL10.alListener3f(4100, (float)$$0.c, (float)$$0.d, (float)$$0.e);
   }

   public elb a() {
      return this.b;
   }

   public void a(Vector3f $$0, Vector3f $$1) {
      AL10.alListenerfv(4111, new float[]{$$0.x(), $$0.y(), $$0.z(), $$1.x(), $$1.y(), $$1.z()});
   }

   public void a(float $$0) {
      AL10.alListenerf(4106, $$0);
      this.a = $$0;
   }

   public float b() {
      return this.a;
   }

   public void c() {
      this.a(elb.b);
      this.a(new Vector3f(0.0F, 0.0F, -1.0F), new Vector3f(0.0F, 1.0F, 0.0F));
   }
}
