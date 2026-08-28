import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdu extends ced {
   private final chi a;
   @Nullable
   private bvf b;
   private final cfw c = cfw.a().a(64.0);

   public cdu(chi $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccd.a.d));
   }

   @Override
   public boolean b() {
      fat $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arc $$1 = a(this.a);
      List<? extends bvf> $$2 = $$1.a(cog.class, this.c, this.a, $$0);
      List<cov> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvf $$4 : $$2) {
         cog $$5 = (cog)$$4;

         for (cov $$6 : $$3) {
            int $$7 = $$5.g($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cov) || !this.b.Z_() && !((cov)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
