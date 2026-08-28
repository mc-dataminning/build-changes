import javax.annotation.Nullable;

public class cuu {
   public static final int a = 20;
   private long b;
   @Nullable
   private jm<cut> c;
   private final jd d;
   private final cuu.a e;

   public cuu(cuu.a $$0, jd $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cut b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(jm<cut> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public int d() {
      return this.c != null ? this.c.a().e() : 0;
   }

   public void a(dcv $$0, jm<cut> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.H_().d(lu.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(dcv $$0, @Nullable dta $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(dxw.F, this.d, dxw.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(dcv $$0, @Nullable dta $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.e()) {
               $$0.a(dxw.E, this.d, dxw.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean e() {
      return this.b % 20L == 0L;
   }

   private static void a(dcv $$0, jd $$1) {
      if ($$0 instanceof aqt $$2) {
         eww $$3 = eww.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(lm.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
