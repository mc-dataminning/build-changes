import javax.annotation.Nullable;

public class cfy {
   public static final cfy a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private cfy.a g;

   private cfy(boolean $$0) {
      this.c = $$0;
   }

   public static cfy a() {
      return new cfy(true);
   }

   public static cfy b() {
      return new cfy(false);
   }

   public cfy c() {
      cfy $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cfy a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cfy d() {
      this.e = false;
      return this;
   }

   public cfy e() {
      this.f = false;
      return this;
   }

   public cfy a(@Nullable cfy.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(arp $$0, @Nullable bvh $$1, bvh $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.ex()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ew() || $$0.ak() == bsh.a)) {
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

            if (this.e && $$1 instanceof bvj $$6 && !$$6.N().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(bvh var1, arp var2);
   }
}
