import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdt extends cec {
   private final chh a;
   @Nullable
   private bve b;
   private final cfv c = cfv.a().a(64.0);

   public cdt(chh $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.d));
   }

   @Override
   public boolean b() {
      ezm $$0 = this.a.cT().c(10.0, 8.0, 10.0);
      List<? extends bve> $$1 = this.a.dY().a(coc.class, this.c, this.a, $$0);
      List<cor> $$2 = this.a.dY().a(this.c, this.a, $$0);

      for (bve $$3 : $$1) {
         coc $$4 = (coc)$$3;

         for (cor $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cor) || !this.b.R_() && !((cor)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
