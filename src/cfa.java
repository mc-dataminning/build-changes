import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfa {
   public static final cfa a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<buk> g;

   private cfa(boolean $$0) {
      this.c = $$0;
   }

   public static cfa a() {
      return new cfa(true);
   }

   public static cfa b() {
      return new cfa(false);
   }

   public cfa c() {
      cfa $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cfa a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cfa d() {
      this.e = false;
      return this;
   }

   public cfa e() {
      this.f = false;
      return this;
   }

   public cfa a(@Nullable Predicate<buk> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable buk $$0, buk $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eu()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.et() || $$1.dS().am() == brm.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ao()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.C($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dx(), $$1.dz(), $$1.dD());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bum $$5 && !$$5.Q().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
