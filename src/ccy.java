import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccy extends cdh {
   private final cgm a;
   @Nullable
   private buk b;
   private final cfa c = cfa.a().a(64.0);

   public ccy(cgm $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.d));
   }

   @Override
   public boolean b() {
      eyn $$0 = this.a.cO().c(10.0, 8.0, 10.0);
      List<? extends buk> $$1 = this.a.dS().a(cnh.class, this.c, this.a, $$0);
      List<cnu> $$2 = this.a.dS().a(this.c, this.a, $$0);

      for (buk $$3 : $$1) {
         cnh $$4 = (cnh)$$3;

         for (cnu $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cnu) || !this.b.P_() && !((cnu)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
