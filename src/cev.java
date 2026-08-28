import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cev {
   public static final cev a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<buf> g;

   private cev(boolean $$0) {
      this.c = $$0;
   }

   public static cev a() {
      return new cev(true);
   }

   public static cev b() {
      return new cev(false);
   }

   public cev c() {
      cev $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cev a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cev d() {
      this.e = false;
      return this;
   }

   public cev e() {
      this.f = false;
      return this;
   }

   public cev a(@Nullable Predicate<buf> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable buf $$0, buf $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eu()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.et() || $$1.dS().am() == brh.a)) {
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

            if (this.e && $$0 instanceof buh $$5 && !$$5.Q().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
