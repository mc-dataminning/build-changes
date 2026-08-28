import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfl extends cef {
   private static final int a = 10;
   private final bxr b;
   private final int c;
   @Nullable
   private iv d;

   public cfl(bxr $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cW()) {
         return false;
      } else if (this.b.dU().V()) {
         return false;
      } else if (this.b.dX().a(this.c) != 0) {
         return false;
      } else {
         arq $$0 = (arq)this.b.dU();
         iv $$1 = this.b.du();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fex $$2 = cif.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jy.a($$1x))));
            this.d = $$2 == null ? null : iv.a((jp)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.O().k() && this.b.O().g().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cgt $$0 = this.b.O();
         if ($$0.k() && !this.d.a(this.b.ds(), 10.0)) {
            fex $$1 = fex.c(this.d);
            fex $$2 = this.b.ds();
            fex $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fex $$4 = $$1.d($$2).d().c(10.0).e($$2);
            iv $$5 = iv.a((jp)$$4);
            $$5 = this.b.dU().a(egn.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azv $$0 = this.b.dX();
      iv $$1 = this.b.dU().a(egn.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
