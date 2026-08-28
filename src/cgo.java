import javax.annotation.Nullable;

public class cgo {
   public static final cgo a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private cgo.a g;

   private cgo(boolean $$0) {
      this.c = $$0;
   }

   public static cgo a() {
      return new cgo(true);
   }

   public static cgo b() {
      return new cgo(false);
   }

   public cgo c() {
      cgo $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cgo a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cgo d() {
      this.e = false;
      return this;
   }

   public cgo e() {
      this.f = false;
      return this;
   }

   public cgo a(@Nullable cgo.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(arx $$0, @Nullable bvx $$1, bvx $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.ey()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ex() || $$0.am() == bsx.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.aq()) || $$1.s($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.C($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.i($$2.dB(), $$2.dD(), $$2.dH());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof bvz $$6 && !$$6.N().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(bvx var1, arx var2);
   }
}
