import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfp extends cfy {
   private final cjg a;
   @Nullable
   private bxc b;
   private final chr c = chr.a().a(64.0);

   public cfp(cjg $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cdy.a.d));
   }

   @Override
   public boolean b() {
      fed $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arq $$1 = a(this.a);
      List<? extends bxc> $$2 = $$1.a(cqk.class, this.c, this.a, $$0);
      List<cqy> $$3 = $$1.a(this.c, this.a, $$0);

      for (bxc $$4 : $$2) {
         cqk $$5 = (cqk)$$4;

         for (cqy $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof cqy $$8 && ($$8.U_() || $$8.b())) {
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
