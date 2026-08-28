import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbr extends cca {
   private final cfe a;
   @Nullable
   private btc b;
   private final cdt c = cdt.a().a(64.0);

   public cbr(cfe $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(caa.a.d));
   }

   @Override
   public boolean a() {
      ewc $$0 = this.a.cM().c(10.0, 8.0, 10.0);
      List<? extends btc> $$1 = this.a.dR().a(cly.class, this.c, this.a, $$0);
      List<cml> $$2 = this.a.dR().a(this.c, this.a, $$0);

      for (btc $$3 : $$1) {
         cly $$4 = (cly)$$3;

         for (cml $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cml) || !this.b.N_() && !((cml)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
