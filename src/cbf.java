import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbf extends cbo {
   private final ces a;
   @Nullable
   private bsq b;
   private final cdh c = cdh.a().a(64.0);

   public cbf(ces $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bzo.a.d));
   }

   @Override
   public boolean a() {
      euh $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends bsq> $$1 = this.a.dP().a(cll.class, this.c, this.a, $$0);
      List<cly> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (bsq $$3 : $$1) {
         cll $$4 = (cll)$$3;

         for (cly $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cly) || !this.b.N_() && !((cly)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
