import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bvb extends bvk {
   private final byo a;
   @Nullable
   private bmo b;
   private final bxd c = bxd.a().a(64.0);

   public bvb(byo $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(btk.a.d));
   }

   @Override
   public boolean a() {
      elx $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bmo> $$1 = this.a.dL().a(cfd.class, this.c, this.a, $$0);
      List<cfq> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bmo $$3 : $$1) {
         cfd $$4 = (cfd)$$3;

         for (cfq $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cfq) || !this.b.P_() && !((cfq)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
