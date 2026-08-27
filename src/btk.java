import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class btk extends btt {
   private final bwv a;
   @Nullable
   private bky b;
   private final bvk c = bvk.a().a(64.0);

   public btk(bwv $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(brt.a.d));
   }

   @Override
   public boolean a() {
      ejd $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bky> $$1 = this.a.dL().a(ccz.class, this.c, this.a, $$0);
      List<cdm> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bky $$3 : $$1) {
         ccz $$4 = (ccz)$$3;

         for (cdm $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cdm) || !this.b.N_() && !((cdm)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
