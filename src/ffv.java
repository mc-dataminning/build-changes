import com.google.common.collect.Queues;
import java.util.Deque;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ffv {
   private final Deque<ffv.a> a = af.a(Queues.newArrayDeque(), $$0 -> {
      Matrix4f $$1 = new Matrix4f();
      Matrix3f $$2 = new Matrix3f();
      $$0.add(new ffv.a($$1, $$2));
   });

   public void a(double $$0, double $$1, double $$2) {
      this.a((float)$$0, (float)$$1, (float)$$2);
   }

   public void a(float $$0, float $$1, float $$2) {
      ffv.a $$3 = this.a.getLast();
      $$3.a.translate($$0, $$1, $$2);
   }

   public void a(fbb $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void b(float $$0, float $$1, float $$2) {
      ffv.a $$3 = this.a.getLast();
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
      ffv.a $$1 = this.a.getLast();
      $$1.a.rotate($$0);
      $$1.b.rotate($$0);
   }

   public void a(Quaternionf $$0, float $$1, float $$2, float $$3) {
      ffv.a $$4 = this.a.getLast();
      $$4.a.rotateAround($$0, $$1, $$2, $$3);
      $$4.b.rotate($$0);
   }

   public void a() {
      this.a.addLast(new ffv.a(this.a.getLast()));
   }

   public void b() {
      this.a.removeLast();
   }

   public ffv.a c() {
      return this.a.getLast();
   }

   public boolean d() {
      return this.a.size() == 1;
   }

   public void e() {
      ffv.a $$0 = this.a.getLast();
      $$0.a.identity();
      $$0.b.identity();
      $$0.c = true;
   }

   public void a(Matrix4f $$0) {
      ffv.a $$1 = this.a.getLast();
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
      final Matrix4f a;
      final Matrix3f b;
      boolean c = true;

      a(Matrix4f $$0, Matrix3f $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      a(ffv.a $$0) {
         this.a = new Matrix4f($$0.a);
         this.b = new Matrix3f($$0.b);
         this.c = $$0.c;
      }

      void d() {
         this.b.set(this.a).invert().transpose();
         this.c = false;
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

      public ffv.a c() {
         return new ffv.a(this);
      }
   }
}
