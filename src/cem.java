import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cem extends cev {
   private final cia a;
   @Nullable
   private bvx b;
   private final cgo c = cgo.a().a(64.0);

   public cem(cia $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.d));
   }

   @Override
   public boolean b() {
      fbm $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arx $$1 = a(this.a);
      List<? extends bvx> $$2 = $$1.a(cpa.class, this.c, this.a, $$0);
      List<cpo> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvx $$4 : $$2) {
         cpa $$5 = (cpa)$$4;

         for (cpo $$6 : $$3) {
            int $$7 = $$5.g($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cpo) || !this.b.aa_() && !((cpo)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
