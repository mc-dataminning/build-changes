import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fiq {
   private final List<fiq.a> a = new ArrayList<>(16);
   private int b;

   public fiq() {
      this.a.add(new fiq.a());
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a((float)$$0, (float)$$1, (float)$$2);
   }

   public void a(float $$0, float $$1, float $$2) {
      this.c().a.translate($$0, $$1, $$2);
   }

   public void a(fdw $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void b(float $$0, float $$1, float $$2) {
      fiq.a $$3 = this.c();
      $$3.a.scale($$0, $$1, $$2);
      if (Math.abs($$0) == Math.abs($$1) && Math.abs($$1) == Math.abs($$2)) {
         if ($$0 < 0.0F || $$1 < 0.0F || $$2 < 0.0F) {
            $$3.b.scale(Math.signum($$0), Math.signum($$1), Math.signum($$2));
         }
      } else {
         $$3.b.scale(1.0F / $$0, 1.0F / $$1, 1.0F / $$2);
         $$3.c = false;
      }
   }

   public void a(Quaternionf $$0) {
      fiq.a $$1 = this.c();
      $$1.a.rotate($$0);
      $$1.b.rotate($$0);
   }

   public void a(Quaternionf $$0, float $$1, float $$2, float $$3) {
      fiq.a $$4 = this.c();
      $$4.a.rotateAround($$0, $$1, $$2, $$3);
      $$4.b.rotate($$0);
   }

   public void a() {
      fiq.a $$0 = this.c();
      this.b++;
      if (this.b >= this.a.size()) {
         this.a.add($$0.c());
      } else {
         this.a.get(this.b).a($$0);
      }
   }

   public void b() {
      if (this.b == 0) {
         throw new NoSuchElementException();
      } else {
         this.b--;
      }
   }

   public fiq.a c() {
      return this.a.get(this.b);
   }

   public boolean d() {
      return this.b == 0;
   }

   public void e() {
      fiq.a $$0 = this.c();
      $$0.a.identity();
      $$0.b.identity();
      $$0.c = true;
   }

   public void a(Matrix4f $$0) {
      fiq.a $$1 = this.c();
      $$1.a.mul($$0);
      if (!f.b($$0)) {
         if (f.c($$0)) {
            $$1.b.mul(new Matrix3f($$0));
         } else {
            $$1.d();
         }
      }
   }

   public static final class a {
      final Matrix4f a = new Matrix4f();
      final Matrix3f b = new Matrix3f();
      boolean c = true;

      a() {
      }

      void d() {
         this.b.set(this.a).invert().transpose();
         this.c = false;
      }

      void a(fiq.a $$0) {
         this.a.set($$0.a);
         this.b.set($$0.b);
         this.c = $$0.c;
      }

      public Matrix4f a() {
         return this.a;
      }

      public Matrix3f b() {
         return this.b;
      }

      public Vector3f a(Vector3f $$0, Vector3f $$1) {
         return this.a($$0.x, $$0.y, $$0.z, $$1);
      }

      public Vector3f a(float $$0, float $$1, float $$2, Vector3f $$3) {
         Vector3f $$4 = this.b.transform($$0, $$1, $$2, $$3);
         return this.c ? $$4 : $$4.normalize();
      }

      public fiq.a c() {
         fiq.a $$0 = new fiq.a();
         $$0.a(this);
         return $$0;
      }
   }
}
