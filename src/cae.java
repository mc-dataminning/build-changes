import java.util.EnumSet;
import javax.annotation.Nullable;

public class cae extends bzl {
   public static final int a = 1;
   protected final bsw b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public cae(bsw $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bV()) {
            ir $$0 = this.a(this.b.dU(), this.b, 5);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.b.eu() != null || this.b.dJ() || this.b.bV();
   }

   protected boolean i() {
      ewu $$0 = cdi.a(this.b, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.d = $$0.c;
         this.e = $$0.d;
         this.f = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.g;
   }

   @Override
   public void c() {
      this.b.J().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.J().l();
   }

   @Nullable
   protected ir a(dbg $$0, brv $$1, int $$2) {
      ir $$3 = $$1.du();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : ir.a($$1.du(), $$2, 1, $$1x -> $$0.b_($$1x).a(awj.a)).orElse(null);
   }
}
