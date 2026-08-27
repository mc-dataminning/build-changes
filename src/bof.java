import java.util.Map;
import java.util.Map.Entry;

public abstract class bof<E extends bmo> implements bog<E> {
   public static final int a = 60;
   protected final Map<bvq<?>, bvr> b;
   private bof.a c = bof.a.a;
   private long d;
   private final int e;
   private final int f;

   public bof(Map<bvq<?>, bvr> $$0) {
      this($$0, 60);
   }

   public bof(Map<bvq<?>, bvr> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public bof(Map<bvq<?>, bvr> $$0, int $$1, int $$2) {
      this.e = $$1;
      this.f = $$2;
      this.b = $$0;
   }

   @Override
   public bof.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ane $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.c = bof.a.b;
         int $$3 = this.e + $$0.F_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.d($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void d(ane $$0, E $$1, long $$2) {
   }

   @Override
   public final void f(ane $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.a($$0, $$1, $$2)) {
         this.c($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }
   }

   protected void c(ane $$0, E $$1, long $$2) {
   }

   @Override
   public final void g(ane $$0, E $$1, long $$2) {
      this.c = bof.a.a;
      this.b($$0, $$1, $$2);
   }

   protected void b(ane $$0, E $$1, long $$2) {
   }

   protected boolean a(ane $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(ane $$0, E $$1) {
      return true;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   protected boolean a(E $$0) {
      for (Entry<bvq<?>, bvr> $$1 : this.b.entrySet()) {
         bvq<?> $$2 = $$1.getKey();
         bvr $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
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
