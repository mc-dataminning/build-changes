import java.util.Map;
import java.util.Map.Entry;

public abstract class bvd<E extends btk> implements bve<E> {
   public static final int a = 60;
   protected final Map<cco<?>, ccp> b;
   private bvd.a c = bvd.a.a;
   private long d;
   private final int e;
   private final int f;

   public bvd(Map<cco<?>, ccp> $$0) {
      this($$0, 60);
   }

   public bvd(Map<cco<?>, ccp> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public bvd(Map<cco<?>, ccp> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public bvd.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arb $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = bvd.a.b;
         int $$3 = this.e + $$0.E_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(arb $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(arb $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(arb $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(arb $$0, E $$1, long $$2) {
      this.c = bvd.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(arb $$0, E $$1, long $$2) {
   }

   protected boolean a(arb $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(arb $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<cco<?>, ccp> $$1 : this.b.entrySet()) {
         cco<?> $$2 = $$1.getKey();
         ccp $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
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
