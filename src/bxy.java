import java.util.Map;
import java.util.Map.Entry;

public abstract class bxy<E extends bwf> implements bxz<E> {
   public static final int a = 60;
   protected final Map<cfj<?>, cfk> b;
   private bxy.a c = bxy.a.a;
   private long d;
   private final int e;
   private final int f;

   public bxy(Map<cfj<?>, cfk> $$0) {
      this($$0, 60);
   }

   public bxy(Map<cfj<?>, cfk> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public bxy(Map<cfj<?>, cfk> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public bxy.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = bxy.a.b;
         int $$3 = this.e + $$0.H_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(ash $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(ash $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.c = bxy.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(ash $$0, E $$1, long $$2) {
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(ash $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<cfj<?>, cfk> $$1 : this.b.entrySet()) {
         cfj<?> $$2 = $$1.getKey();
         cfk $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
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
