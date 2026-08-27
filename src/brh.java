import java.util.Map;
import java.util.Map.Entry;

public abstract class brh<E extends bpp> implements bri<E> {
   public static final int a = 60;
   protected final Map<bys<?>, byt> b;
   private brh.a c = brh.a.a;
   private long d;
   private final int e;
   private final int f;

   public brh(Map<bys<?>, byt> $$0) {
      this($$0, 60);
   }

   public brh(Map<bys<?>, byt> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public brh(Map<bys<?>, byt> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public brh.a a() {
      return this.c;
   }

   @Override
   public final boolean e(apf $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = brh.a.b;
         int $$3 = this.e + $$0.E_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(apf $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(apf $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(apf $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(apf $$0, E $$1, long $$2) {
      this.c = brh.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(apf $$0, E $$1, long $$2) {
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(apf $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<bys<?>, byt> $$1 : this.b.entrySet()) {
         bys<?> $$2 = $$1.getKey();
         byt $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
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
