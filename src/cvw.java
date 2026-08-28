import javax.annotation.Nullable;

public class cvw {
   public static final int a = 20;
   private long b;
   @Nullable
   private jn<cvv> c;
   private final je d;
   private final cvw.a e;

   public cvw(cvw.a $$0, je $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cvv b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(jn<cvv> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(deh $$0, jn<cvv> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.F_().d(lv.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(deh $$0, @Nullable duo $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(dzl.F, this.d, dzl.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(deh $$0, @Nullable duo $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(dzl.E, this.d, dzl.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(deh $$0, je $$1) {
      if ($$0 instanceof arh $$2) {
         eys $$3 = eys.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.C_().a(4) / 24.0F;
         $$2.a(ln.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
