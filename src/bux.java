import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bux extends bvg {
   private final byj a;
   @Nullable
   private bmk b;
   private final bwy c = bwy.a().a(64.0);

   public bux(byj $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(btg.a.d));
   }

   @Override
   public boolean a() {
      eln $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bmk> $$1 = this.a.dM().a(ceu.class, this.c, this.a, $$0);
      List<cfh> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bmk $$3 : $$1) {
         ceu $$4 = (ceu)$$3;

         for (cfh $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cfh) || !this.b.P_() && !((cfh)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
