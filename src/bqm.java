import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqm {
   public static final bqm a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bfz> g;

   private bqm(boolean $$0) {
      this.c = $$0;
   }

   public static bqm a() {
      return new bqm(true);
   }

   public static bqm b() {
      return new bqm(false);
   }

   public bqm c() {
      bqm $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bqm a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bqm d() {
      this.e = false;
      return this;
   }

   public bqm e() {
      this.f = false;
      return this;
   }

   public bqm a(@Nullable Predicate<bfz> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bfz $$0, bfz $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.el()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.ek() || $$1.dI().ai() == bdu.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ae()) || $$0.p($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.y($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dn(), $$1.dp(), $$1.dt());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bgb $$5 && !$$5.K().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
