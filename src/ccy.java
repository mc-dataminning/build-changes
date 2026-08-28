import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccy extends ccf {
   public static final int b = 1;
   protected final bvp c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvp, axs<btd>> a;

   public ccy(bvp $$0, double $$1) {
      this($$0, $$1, axe.F);
   }

   public ccy(bvp $$0, double $$1, axs<btd> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccy(bvp $$0, double $$1, Function<bvp, axs<btd>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ccf.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            jh $$0 = this.a(this.c.dV(), this.c, 5);
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
      return this.c.eF() != null && this.c.eF().a(this.a.apply(this.c));
   }

   protected boolean i() {
      ezy $$0 = cgc.a(this.c, 5, 4);
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
      this.c.L().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.L().m();
   }

   @Nullable
   protected jh a(der $$0, bul $$1, int $$2) {
      jh $$3 = $$1.dv();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : jh.a($$1.dv(), $$2, 1, $$1x -> $$0.b_($$1x).a(axi.a)).orElse(null);
   }
}
