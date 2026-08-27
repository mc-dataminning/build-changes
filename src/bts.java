import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bts extends bub {
   private final bxd a;
   @Nullable
   private blg b;
   private final bvs c = bvs.a().a(64.0);

   public bts(bxd $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.d));
   }

   @Override
   public boolean a() {
      ejp $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends blg> $$1 = this.a.dN().a(cdh.class, this.c, this.a, $$0);
      List<cdu> $$2 = this.a.dN().a(this.c, this.a, $$0);

      for (blg $$3 : $$1) {
         cdh $$4 = (cdh)$$3;

         for (cdu $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cdu) || !this.b.O_() && !((cdu)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
