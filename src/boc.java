import java.util.Map;
import java.util.Map.Entry;

public abstract class boc<E extends bml> implements bod<E> {
   public static final int a = 60;
   protected final Map<bvn<?>, bvo> b;
   private boc.a c = boc.a.a;
   private long d;
   private final int e;
   private final int f;

   public boc(Map<bvn<?>, bvo> $$0) {
      this($$0, 60);
   }

   public boc(Map<bvn<?>, bvo> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public boc(Map<bvn<?>, bvo> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public boc.a a() {
      return this.c;
   }

   @Override
   public final boolean e(and $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = boc.a.b;
         int $$3 = this.e + $$0.F_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(and $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(and $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(and $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(and $$0, E $$1, long $$2) {
      this.c = boc.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(and $$0, E $$1, long $$2) {
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(and $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<bvn<?>, bvo> $$1 : this.b.entrySet()) {
         bvn<?> $$2 = $$1.getKey();
         bvo $$3 = $$1.getValue();
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
