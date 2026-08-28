import javax.annotation.Nullable;

public class cyf {
   public static final int a = 20;
   private long b;
   @Nullable
   private js<cye> c;
   private final jj d;
   private final cyf.a e;

   public cyf(cyf.a $$0, jj $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cye b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(js<cye> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(dhq $$0, js<cye> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.F_().f(me.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(dhq $$0, @Nullable dym $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(edm.F, this.d, edm.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(dhq $$0, @Nullable dym $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(edm.E, this.d, edm.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(dhq $$0, jj $$1) {
      if ($$0 instanceof arn $$2) {
         fcu $$3 = fcu.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.C_().a(4) / 24.0F;
         $$2.a(lv.ad, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
