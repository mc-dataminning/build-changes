import javax.annotation.Nullable;

public class cxw {
   public static final int a = 20;
   private long b;
   @Nullable
   private jq<cxv> c;
   private final jh d;
   private final cxw.a e;

   public cxw(cxw.a $$0, jh $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cxv b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(jq<cxv> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(dhj $$0, jq<cxv> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.K_().e(mb.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(dhj $$0, @Nullable dxv $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(ecr.F, this.d, ecr.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(dhj $$0, @Nullable dxv $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(ecr.E, this.d, ecr.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(dhj $$0, jh $$1) {
      if ($$0 instanceof ash $$2) {
         fby $$3 = fby.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.H_().a(4) / 24.0F;
         $$2.a(ls.ab, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
