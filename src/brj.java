import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brj extends brs {
   private final buu a;
   @Nullable
   private biw b;
   private final btj c = btj.a().a(64.0);

   public brj(buu $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bps.a.d));
   }

   @Override
   public boolean a() {
      eha $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends biw> $$1 = this.a.dK().a(cay.class, this.c, this.a, $$0);
      List<cbl> $$2 = this.a.dK().a(this.c, this.a, $$0);

      for (biw $$3 : $$1) {
         cay $$4 = (cay)$$3;

         for (cbl $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbl) || !this.b.G_() && !((cbl)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
