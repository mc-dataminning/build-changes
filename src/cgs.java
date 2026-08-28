import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cgs extends chb {
   private final ckl a;
   @Nullable
   private byf b;
   private final ciu c = ciu.a().a(64.0);

   public cgs(ckl $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.d));
   }

   @Override
   public boolean b() {
      ffx $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      asb $$1 = a(this.a);
      List<? extends byf> $$2 = $$1.a(cru.class, this.c, this.a, $$0);
      List<csi> $$3 = $$1.a(this.c, this.a, $$0);

      for (byf $$4 : $$2) {
         cru $$5 = (cru)$$4;

         for (csi $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         if (this.b instanceof csi $$8 && ($$8.aa_() || $$8.b())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.g(this.b);
      super.d();
   }
}
