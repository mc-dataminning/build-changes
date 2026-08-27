import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bsv extends bte {
   private final bwg a;
   @Nullable
   private bkj b;
   private final buv c = buv.a().a(64.0);

   public bsv(bwg $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bre.a.d));
   }

   @Override
   public boolean a() {
      eia $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bkj> $$1 = this.a.dL().a(cck.class, this.c, this.a, $$0);
      List<ccx> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bkj $$3 : $$1) {
         cck $$4 = (cck)$$3;

         for (ccx $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof ccx) || !this.b.N_() && !((ccx)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
