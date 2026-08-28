import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfm extends cfv {
   private final cja a;
   @Nullable
   private bwz b;
   private final cho c = cho.a().a(64.0);

   public cfm(cja $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.d));
   }

   @Override
   public boolean b() {
      fdr $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      aro $$1 = a(this.a);
      List<? extends bwz> $$2 = $$1.a(cqe.class, this.c, this.a, $$0);
      List<cqs> $$3 = $$1.a(this.c, this.a, $$0);

      for (bwz $$4 : $$2) {
         cqe $$5 = (cqe)$$4;

         for (cqs $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof cqs $$8 && ($$8.U_() || $$8.b())) {
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
