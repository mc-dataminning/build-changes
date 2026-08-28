import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccc extends ccl {
   private final cfp a;
   @Nullable
   private btn b;
   private final cee c = cee.a().a(64.0);

   public ccc(cfp $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cal.a.d));
   }

   @Override
   public boolean a() {
      evk $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btn> $$1 = this.a.dP().a(cmi.class, this.c, this.a, $$0);
      List<cmv> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (btn $$3 : $$1) {
         cmi $$4 = (cmi)$$3;

         for (cmv $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmv) || !this.b.N_() && !((cmv)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
