import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cbv extends cbc {
   public static final int b = 1;
   protected final bun c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bun, axi<bsd>> a;

   public cbv(bun $$0, double $$1) {
      this($$0, $$1, awu.F);
   }

   public cbv(bun $$0, double $$1, axi<bsd> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cbv(bun $$0, double $$1, Function<bun, axi<bsd>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cbc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bV()) {
            je $$0 = this.a(this.c.dS(), this.c, 5);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.c.eC() != null && this.c.eC().a(this.a.apply(this.c));
   }

   protected boolean i() {
      eye $$0 = cez.a(this.c, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.e = $$0.d;
         this.f = $$0.e;
         this.g = $$0.f;
         return true;
      }
   }

   public boolean k() {
      return this.h;
   }

   @Override
   public void d() {
      this.c.P().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.P().m();
   }

   @Nullable
   protected je a(dcx $$0, btj $$1, int $$2) {
      je $$3 = $$1.ds();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : je.a($$1.ds(), $$2, 1, $$1x -> $$0.b_($$1x).a(awy.a)).orElse(null);
   }
}
