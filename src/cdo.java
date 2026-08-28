import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cdo extends ccv {
   public static final int b = 1;
   protected final bwf c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bwf, aya<btt>> a;

   public cdo(bwf $$0, double $$1) {
      this($$0, $$1, axm.F);
   }

   public cdo(bwf $$0, double $$1, aya<btt> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cdo(bwf $$0, double $$1, Function<bwf, aya<btt>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ccv.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            jh $$0 = this.a(this.c.dW(), this.c, 5);
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
      return this.c.eG() != null && this.c.eG().a(this.a.apply(this.c));
   }

   protected boolean i() {
      fbr $$0 = cgs.a(this.c, 5, 4);
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
   protected jh a(dge $$0, bvb $$1, int $$2) {
      jh $$3 = $$1.dw();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : jh.a($$1.dw(), $$2, 1, $$1x -> $$0.b_($$1x).a(axq.a)).orElse(null);
   }
}
