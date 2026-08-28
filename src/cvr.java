import javax.annotation.Nullable;

public class cvr {
   public static final int a = 20;
   private long b;
   @Nullable
   private jn<cvq> c;
   private final je d;
   private final cvr.a e;

   public cvr(cvr.a $$0, je $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cvq b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(jn<cvq> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(ddt $$0, jn<cvq> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.F_().d(lv.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(ddt $$0, @Nullable dua $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(dyx.F, this.d, dyx.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(ddt $$0, @Nullable dua $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(dyx.E, this.d, dyx.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(ddt $$0, je $$1) {
      if ($$0 instanceof arg $$2) {
         eye $$3 = eye.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.C_().a(4) / 24.0F;
         $$2.a(ln.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
