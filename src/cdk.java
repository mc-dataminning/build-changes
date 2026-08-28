import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdk extends cce {
   private static final int a = 10;
   private final bvo b;
   private final int c;
   @Nullable
   private ji d;

   public cdk(bvo $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cce.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cY()) {
         return false;
      } else if (this.b.dW().V()) {
         return false;
      } else if (this.b.dZ().a(this.c) != 0) {
         return false;
      } else {
         arc $$0 = (arc)this.b.dW();
         ji $$1 = this.b.dw();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fba $$2 = cge.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kk.a($$1x))));
            this.d = $$2 == null ? null : ji.a((kb)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.L().k() && this.b.L().g().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         ces $$0 = this.b.L();
         if ($$0.k() && !this.d.a(this.b.du(), 10.0)) {
            fba $$1 = fba.c(this.d);
            fba $$2 = this.b.du();
            fba $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fba $$4 = $$1.d($$2).d().c(10.0).e($$2);
            ji $$5 = ji.a((kb)$$4);
            $$5 = this.b.dW().a(ecs.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azh $$0 = this.b.dZ();
      ji $$1 = this.b.dW().a(ecs.a.f, this.b.dw().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
