import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cen extends cew {
   private final cib a;
   @Nullable
   private bvy b;
   private final cgp c = cgp.a().a(64.0);

   public cen(cib $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.d));
   }

   @Override
   public boolean b() {
      fbs $$0 = this.a.cQ().c(10.0, 8.0, 10.0);
      ard $$1 = a(this.a);
      List<? extends bvy> $$2 = $$1.a(cpd.class, this.c, this.a, $$0);
      List<cpr> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvy $$4 : $$2) {
         cpd $$5 = (cpd)$$4;

         for (cpr $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof cpr $$8 && ($$8.U_() || $$8.b())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
