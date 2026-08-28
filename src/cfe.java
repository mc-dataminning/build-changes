import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfe extends cfn {
   private final cis a;
   @Nullable
   private bwr b;
   private final chg c = chg.a().a(64.0);

   public cfe(cis $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cdn.a.d));
   }

   @Override
   public boolean b() {
      fcp $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arn $$1 = a(this.a);
      List<? extends bwr> $$2 = $$1.a(cpu.class, this.c, this.a, $$0);
      List<cqi> $$3 = $$1.a(this.c, this.a, $$0);

      for (bwr $$4 : $$2) {
         cpu $$5 = (cpu)$$4;

         for (cqi $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof cqi $$8 && ($$8.U_() || $$8.b())) {
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
