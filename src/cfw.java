import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfw extends cgf {
   private final cjp a;
   @Nullable
   private bxj b;
   private final chy c = chy.a().a(64.0);

   public cfw(cjp $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cef.a.d));
   }

   @Override
   public boolean b() {
      fes $$0 = this.a.cQ().c(10.0, 8.0, 10.0);
      arq $$1 = a(this.a);
      List<? extends bxj> $$2 = $$1.a(cqv.class, this.c, this.a, $$0);
      List<crj> $$3 = $$1.a(this.c, this.a, $$0);

      for (bxj $$4 : $$2) {
         cqv $$5 = (cqv)$$4;

         for (crj $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof crj $$8 && ($$8.V_() || $$8.b())) {
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
