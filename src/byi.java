import java.util.Map;
import java.util.Map.Entry;

public abstract class byi<E extends bwr> implements byj<E> {
   public static final int a = 60;
   protected final Map<cft<?>, cfu> b;
   private byi.a c = byi.a.a;
   private long d;
   private final int e;
   private final int f;

   public byi(Map<cft<?>, cfu> $$0) {
      this($$0, 60);
   }

   public byi(Map<cft<?>, cfu> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public byi(Map<cft<?>, cfu> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public byi.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arn $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = byi.a.b;
         int $$3 = this.e + $$0.C_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(arn $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(arn $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(arn $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(arn $$0, E $$1, long $$2) {
      this.c = byi.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(arn $$0, E $$1, long $$2) {
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(arn $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<cft<?>, cfu> $$1 : this.b.entrySet()) {
         cft<?> $$2 = $$1.getKey();
         cfu $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
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
