import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class eoc extends eoa {
   private final eof f;
   private final Matrix4f g;
   private final Matrix3f h;
   private final float i;
   private float j;
   private float k;
   private float l;
   private int m;
   private int n;
   private int o;
   private float p;
   private float q;
   private float r;

   public eoc(eof $$0, Matrix4f $$1, Matrix3f $$2, float $$3) {
      this.f = $$0;
      this.g = new Matrix4f($$1).invert();
      this.h = new Matrix3f($$2).invert();
      this.i = $$3;
      this.a();
   }

   private void a() {
      this.j = 0.0F;
      this.k = 0.0F;
      this.l = 0.0F;
      this.m = 0;
      this.n = 10;
      this.o = 15728880;
      this.p = 0.0F;
      this.q = 1.0F;
      this.r = 0.0F;
   }

   @Override
   public void e() {
      Vector3f $$0 = this.h.transform(new Vector3f(this.p, this.q, this.r));
      ib $$1 = ib.a($$0.x(), $$0.y(), $$0.z());
      Vector4f $$2 = this.g.transform(new Vector4f(this.j, this.k, this.l, 1.0F));
      $$2.rotateY((float) Math.PI);
      $$2.rotateX((float) (-Math.PI / 2));
      $$2.rotate($$1.b());
      float $$3 = -$$2.x() * this.i;
      float $$4 = -$$2.y() * this.i;
      this.f.a((double)this.j, (double)this.k, (double)this.l).a(1.0F, 1.0F, 1.0F, 1.0F).a($$3, $$4).a(this.m, this.n).b(this.o).a(this.p, this.q, this.r).e();
      this.a();
   }

   @Override
   public eof a(double $$0, double $$1, double $$2) {
      this.j = (float)$$0;
      this.k = (float)$$1;
      this.l = (float)$$2;
      return this;
   }

   @Override
   public eof a(int $$0, int $$1, int $$2, int $$3) {
      return this;
   }

   @Override
   public eof a(float $$0, float $$1) {
      return this;
   }

   @Override
   public eof a(int $$0, int $$1) {
      this.m = $$0;
      this.n = $$1;
      return this;
   }

   @Override
   public eof b(int $$0, int $$1) {
      this.o = $$0 | $$1 << 16;
      return this;
   }

   @Override
   public eof a(float $$0, float $$1, float $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      return this;
   }
}
