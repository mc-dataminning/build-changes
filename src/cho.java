import javax.annotation.Nullable;

public class cho {
   public static final cho a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private cho.a g;

   private cho(boolean $$0) {
      this.c = $$0;
   }

   public static cho a() {
      return new cho(true);
   }

   public static cho b() {
      return new cho(false);
   }

   public cho c() {
      cho $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cho a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cho d() {
      this.e = false;
      return this;
   }

   public cho e() {
      this.f = false;
      return this;
   }

   public cho a(@Nullable cho.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(aro $$0, @Nullable bwz $$1, bwz $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.ez()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ey() || $$0.an() == btv.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.aq()) || $$1.s($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.C($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.i($$2.dA(), $$2.dC(), $$2.dG());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof bxb $$6 && !$$6.P().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(bwz var1, aro var2);
   }
}
