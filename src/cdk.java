import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdk extends cdt {
   private final cgy a;
   @Nullable
   private buv b;
   private final cfm c = cfm.a().a(64.0);

   public cdk(cgy $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.d));
   }

   @Override
   public boolean b() {
      ezc $$0 = this.a.cS().c(10.0, 8.0, 10.0);
      List<? extends buv> $$1 = this.a.dX().a(cnt.class, this.c, this.a, $$0);
      List<coh> $$2 = this.a.dX().a(this.c, this.a, $$0);

      for (buv $$3 : $$1) {
         cnt $$4 = (cnt)$$3;

         for (coh $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof coh) || !this.b.R_() && !((coh)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
