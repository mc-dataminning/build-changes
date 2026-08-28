import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccd extends ccm {
   private final cfq a;
   @Nullable
   private btn b;
   private final cef c = cef.a().a(64.0);

   public ccd(cfq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cam.a.d));
   }

   @Override
   public boolean b() {
      ewx $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btn> $$1 = this.a.dO().a(cmk.class, this.c, this.a, $$0);
      List<cmx> $$2 = this.a.dO().a(this.c, this.a, $$0);

      for (btn $$3 : $$1) {
         cmk $$4 = (cmk)$$3;

         for (cmx $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmx) || !this.b.R_() && !((cmx)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
