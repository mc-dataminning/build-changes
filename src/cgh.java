import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cgh extends cgq {
   private final cka a;
   @Nullable
   private bxu b;
   private final cij c = cij.a().a(64.0);

   public cgh(cka $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.d));
   }

   @Override
   public boolean b() {
      ffl $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ars $$1 = a(this.a);
      List<? extends bxu> $$2 = $$1.a(crj.class, this.c, this.a, $$0);
      List<crx> $$3 = $$1.a(this.c, this.a, $$0);

      for (bxu $$4 : $$2) {
         crj $$5 = (crj)$$4;

         for (crx $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof crx $$8 && ($$8.Z_() || $$8.b())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.g(this.b);
      super.d();
   }
}
