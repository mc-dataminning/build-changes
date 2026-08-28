import javax.annotation.Nullable;

public class czk {
   public static final int a = 20;
   private long b;
   @Nullable
   private je<czj> c;
   private final iu d;
   private final czk.a e;

   public czk(czk.a $$0, iu $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public czj b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(je<czj> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(djb $$0, je<czj> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.F_().f(mg.aV).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(djb $$0, @Nullable eah $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(efh.F, this.d, efh.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(djb $$0, @Nullable eah $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(efh.E, this.d, efh.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(djb $$0, iu $$1) {
      if ($$0 instanceof arq $$2) {
         feq $$3 = feq.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.C_().a(4) / 24.0F;
         $$2.a(lx.ad, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
