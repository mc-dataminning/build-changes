import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbc extends cbl {
   private final ceq a;
   @Nullable
   private bso b;
   private final cde c = cde.a().a(64.0);

   public cbc(ceq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.d));
   }

   @Override
   public boolean a() {
      ewp $$0 = this.a.cP().c(10.0, 8.0, 10.0);
      List<? extends bso> $$1 = this.a.dU().a(cll.class, this.c, this.a, $$0);
      List<cly> $$2 = this.a.dU().a(this.c, this.a, $$0);

      for (bso $$3 : $$1) {
         cll $$4 = (cll)$$3;

         for (cly $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cly) || !this.b.O_() && !((cly)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
