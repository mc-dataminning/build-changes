import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ceq extends cez {
   private final cie a;
   @Nullable
   private bwb b;
   private final cgs c = cgs.a().a(64.0);

   public ceq(cie $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccz.a.d));
   }

   @Override
   public boolean b() {
      fbn $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ash $$1 = a(this.a);
      List<? extends bwb> $$2 = $$1.a(cpe.class, this.c, this.a, $$0);
      List<cps> $$3 = $$1.a(this.c, this.a, $$0);

      for (bwb $$4 : $$2) {
         cpe $$5 = (cpe)$$4;

         for (cps $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cps) || !this.b.aa_() && !((cps)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
