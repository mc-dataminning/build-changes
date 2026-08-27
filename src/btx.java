import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class btx extends bug {
   private final bxi a;
   @Nullable
   private bll b;
   private final bvx c = bvx.a().a(64.0);

   public btx(bxi $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.d));
   }

   @Override
   public boolean a() {
      eju $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bll> $$1 = this.a.dN().a(cdm.class, this.c, this.a, $$0);
      List<cdz> $$2 = this.a.dN().a(this.c, this.a, $$0);

      for (bll $$3 : $$1) {
         cdm $$4 = (cdm)$$3;

         for (cdz $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cdz) || !this.b.P_() && !((cdz)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
