import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class fke implements fkh {
   private final fkh a;
   private final Matrix4f b;
   private final Matrix3f c;
   private final float d;
   private final Vector3f e = new Vector3f();
   private final Vector3f f = new Vector3f();
   private float g;
   private float h;
   private float i;

   public fke(fkh $$0, fkd.a $$1, float $$2) {
      this.a = $$0;
      this.b = new Matrix4f($$1.a()).invert();
      this.c = new Matrix3f($$1.b()).invert();
      this.d = $$2;
   }

   @Override
   public fkh a(float $$0, float $$1, float $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.a.a($$0, $$1, $$2);
      return this;
   }

   @Override
   public fkh a(int $$0, int $$1, int $$2, int $$3) {
      this.a.a(-1);
      return this;
   }

   @Override
   public fkh a(float $$0, float $$1) {
      return this;
   }

   @Override
   public fkh a(int $$0, int $$1) {
      this.a.a($$0, $$1);
      return this;
   }

   @Override
   public fkh b(int $$0, int $$1) {
      this.a.b($$0, $$1);
      return this;
   }

   @Override
   public fkh b(float $$0, float $$1, float $$2) {
      this.a.b($$0, $$1, $$2);
      Vector3f $$3 = this.c.transform($$0, $$1, $$2, this.f);
      jb $$4 = jb.a($$3.x(), $$3.y(), $$3.z());
      Vector3f $$5 = this.b.transformPosition(this.g, this.h, this.i, this.e);
      $$5.rotateY((float) Math.PI);
      $$5.rotateX((float) (-Math.PI / 2));
      $$5.rotate($$4.b());
      this.a.a(-$$5.x() * this.d, -$$5.y() * this.d);
      return this;
   }
}
