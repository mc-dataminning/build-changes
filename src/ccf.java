import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccf extends cco {
   private final cfs a;
   @Nullable
   private btq b;
   private final ceh c = ceh.a().a(64.0);

   public ccf(cfs $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cao.a.d));
   }

   @Override
   public boolean a() {
      evn $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btq> $$1 = this.a.dP().a(cml.class, this.c, this.a, $$0);
      List<cmy> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (btq $$3 : $$1) {
         cml $$4 = (cml)$$3;

         for (cmy $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmy) || !this.b.N_() && !((cmy)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
