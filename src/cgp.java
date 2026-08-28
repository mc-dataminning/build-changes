import javax.annotation.Nullable;

public class cgp {
   public static final cgp a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private cgp.a g;

   private cgp(boolean $$0) {
      this.c = $$0;
   }

   public static cgp a() {
      return new cgp(true);
   }

   public static cgp b() {
      return new cgp(false);
   }

   public cgp c() {
      cgp $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cgp a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cgp d() {
      this.e = false;
      return this;
   }

   public cgp e() {
      this.f = false;
      return this;
   }

   public cgp a(@Nullable cgp.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(ard $$0, @Nullable bvy $$1, bvy $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.ey()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ex() || $$0.an() == bsv.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.aq()) || $$1.s($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.C($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.i($$2.dz(), $$2.dB(), $$2.dF());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof bwa $$6 && !$$6.P().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(bvy var1, ard var2);
   }
}
