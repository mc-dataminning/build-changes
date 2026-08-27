import java.util.EnumSet;
import javax.annotation.Nullable;

public class car extends bzl {
   private static final int a = 10;
   private final bsw b;
   private final int c;
   @Nullable
   private ir d;

   public car(bsw $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cW()) {
         return false;
      } else if (this.b.dU().R()) {
         return false;
      } else if (this.b.et().a(this.c) != 0) {
         return false;
      } else {
         aqt $$0 = (aqt)this.b.dU();
         ir $$1 = this.b.du();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ewu $$2 = cdl.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jt.a($$1x))));
            this.d = $$2 == null ? null : ir.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.J().l() && this.b.J().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         cbz $$0 = this.b.J();
         if ($$0.l() && !this.d.a(this.b.ds(), 10.0)) {
            ewu $$1 = ewu.c(this.d);
            ewu $$2 = this.b.ds();
            ewu $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ewu $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ir $$5 = ir.a($$4);
            $$5 = this.b.dU().a(dyu.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayt $$0 = this.b.et();
      ir $$1 = this.b.dU().a(dyu.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
