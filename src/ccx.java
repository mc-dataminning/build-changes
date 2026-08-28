import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccx extends cce {
   public static final int b = 1;
   protected final bvo c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvo, axf<btc>> a;

   public ccx(bvo $$0, double $$1) {
      this($$0, $$1, awr.F);
   }

   public ccx(bvo $$0, double $$1, axf<btc> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccx(bvo $$0, double $$1, Function<bvo, axf<btc>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cce.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            ji $$0 = this.a(this.c.dW(), this.c, 5);
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
      fba $$0 = cgb.a(this.c, 5, 4);
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
      return !this.c.L().k();
   }

   @Nullable
   protected ji a(dfn $$0, buk $$1, int $$2) {
      ji $$3 = $$1.dw();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : ji.a($$1.dw(), $$2, 1, $$1x -> $$0.b_($$1x).a(awv.a)).orElse(null);
   }
}
