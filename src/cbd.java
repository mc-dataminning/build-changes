import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbd extends cbm {
   private final ceq a;
   @Nullable
   private bso b;
   private final cdf c = cdf.a().a(64.0);

   public cbd(ceq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.d));
   }

   @Override
   public boolean a() {
      euf $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends bso> $$1 = this.a.dP().a(clj.class, this.c, this.a, $$0);
      List<clw> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (bso $$3 : $$1) {
         clj $$4 = (clj)$$3;

         for (clw $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof clw) || !this.b.N_() && !((clw)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
