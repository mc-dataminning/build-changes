import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdp extends cdy {
   private final chd a;
   @Nullable
   private bva b;
   private final cfr c = cfr.a().a(64.0);

   public cdp(chd $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cby.a.d));
   }

   @Override
   public boolean b() {
      ezi $$0 = this.a.cS().c(10.0, 8.0, 10.0);
      List<? extends bva> $$1 = this.a.dX().a(cny.class, this.c, this.a, $$0);
      List<com> $$2 = this.a.dX().a(this.c, this.a, $$0);

      for (bva $$3 : $$1) {
         cny $$4 = (cny)$$3;

         for (com $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof com) || !this.b.R_() && !((com)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
