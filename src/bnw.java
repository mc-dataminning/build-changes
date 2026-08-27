import java.util.Map;
import java.util.Map.Entry;

public abstract class bnw<E extends bmf> implements bnx<E> {
   public static final int a = 60;
   protected final Map<bvh<?>, bvi> b;
   private bnw.a c = bnw.a.a;
   private long d;
   private final int e;
   private final int f;

   public bnw(Map<bvh<?>, bvi> $$0) {
      this($$0, 60);
   }

   public bnw(Map<bvh<?>, bvi> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public bnw(Map<bvh<?>, bvi> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public bnw.a a() {
      return this.c;
   }

   @Override
   public final boolean e(amz $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = bnw.a.b;
         int $$3 = this.e + $$0.F_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(amz $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(amz $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(amz $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(amz $$0, E $$1, long $$2) {
      this.c = bnw.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(amz $$0, E $$1, long $$2) {
   }

   protected boolean a(amz $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(amz $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<bvh<?>, bvi> $$1 : this.b.entrySet()) {
         bvh<?> $$2 = $$1.getKey();
         bvi $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   public static enum a {
      a,
      b;
   }
}
