import com.google.common.collect.Queues;
import java.util.Deque;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public class epz {
   private final Deque<epz.a> a = ac.a(Queues.newArrayDeque(), $$0 -> {
      Matrix4f $$1 = new Matrix4f();
      Matrix3f $$2 = new Matrix3f();
      $$0.add(new epz.a($$1, $$2));
   });

   public void a(double $$0, double $$1, double $$2) {
      this.a((float)$$0, (float)$$1, (float)$$2);
   }

   public void a(float $$0, float $$1, float $$2) {
      epz.a $$3 = this.a.getLast();
      $$3.a.translate($$0, $$1, $$2);
   }

   public void b(float $$0, float $$1, float $$2) {
      epz.a $$3 = this.a.getLast();
      $$3.a.scale($$0, $$1, $$2);
      if ($$0 == $$1 && $$1 == $$2) {
         if ($$0 > 0.0F) {
            return;
         }

         $$3.b.scale(-1.0F);
      }

      float $$4 = 1.0F / $$0;
      float $$5 = 1.0F / $$1;
      float $$6 = 1.0F / $$2;
      float $$7 = aun.j($$4 * $$5 * $$6);
      $$3.b.scale($$7 * $$4, $$7 * $$5, $$7 * $$6);
   }

   public void a(Quaternionf $$0) {
      epz.a $$1 = this.a.getLast();
      $$1.a.rotate($$0);
      $$1.b.rotate($$0);
   }

   public void a(Quaternionf $$0, float $$1, float $$2, float $$3) {
      epz.a $$4 = this.a.getLast();
      $$4.a.rotateAround($$0, $$1, $$2, $$3);
      $$4.b.rotate($$0);
   }

   public void a() {
      epz.a $$0 = this.a.getLast();
      this.a.addLast(new epz.a(new Matrix4f($$0.a), new Matrix3f($$0.b)));
   }

   public void b() {
      this.a.removeLast();
   }

   public epz.a c() {
      return this.a.getLast();
   }

   public boolean d() {
      return this.a.size() == 1;
   }

   public void e() {
      epz.a $$0 = this.a.getLast();
      $$0.a.identity();
      $$0.b.identity();
   }

   public void a(Matrix4f $$0) {
      this.a.getLast().a.mul($$0);
   }

   public static final class a {
      final Matrix4f a;
      final Matrix3f b;

      a(Matrix4f $$0, Matrix3f $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public Matrix4f a() {
         return this.a;
      }

      public Matrix3f b() {
         return this.b;
      }
   }
}
