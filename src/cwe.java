import javax.annotation.Nullable;

public class cwe {
   public static final int a = 20;
   private long b;
   @Nullable
   private jp<cwd> c;
   private final jg d;
   private final cwe.a e;

   public cwe(cwe.a $$0, jg $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   public boolean a() {
      return this.c != null;
   }

   @Nullable
   public cwd b() {
      return this.c == null ? null : this.c.a();
   }

   public long c() {
      return this.b;
   }

   public void a(jp<cwd> $$0, long $$1) {
      if (!$$0.a().a($$1)) {
         this.c = $$0;
         this.b = $$1;
      }
   }

   public void a(dew $$0, jp<cwd> $$1) {
      this.c = $$1;
      this.b = 0L;
      int $$2 = $$0.H_().e(ly.L).a(this.c.a());
      $$0.a(null, 1010, this.d, $$2);
      this.e.notifyChange();
   }

   public void a(dew $$0, @Nullable dvd $$1) {
      if (this.c != null) {
         this.c = null;
         this.b = 0L;
         $$0.a(eaa.F, this.d, eaa.a.a($$1));
         $$0.c(1011, this.d, 0);
         this.e.notifyChange();
      }
   }

   public void b(dew $$0, @Nullable dvd $$1) {
      if (this.c != null) {
         if (this.c.a().a(this.b)) {
            this.a($$0, $$1);
         } else {
            if (this.d()) {
               $$0.a(eaa.E, this.d, eaa.a.a($$1));
               a($$0, this.d);
            }

            this.b++;
         }
      }
   }

   private boolean d() {
      return this.b % 20L == 0L;
   }

   private static void a(dew $$0, jg $$1) {
      if ($$0 instanceof arm $$2) {
         ezh $$3 = ezh.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(lq.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   @FunctionalInterface
   public interface a {
      void notifyChange();
   }
}
