import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ceu extends cfd {
   private final cii a;
   @Nullable
   private bwf b;
   private final cgw c = cgw.a().a(64.0);

   public ceu(cii $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.d));
   }

   @Override
   public boolean b() {
      fbs $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ash $$1 = a(this.a);
      List<? extends bwf> $$2 = $$1.a(cpi.class, this.c, this.a, $$0);
      List<cpw> $$3 = $$1.a(this.c, this.a, $$0);

      for (bwf $$4 : $$2) {
         cpi $$5 = (cpi)$$4;

         for (cpw $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cpw) || !this.b.aa_() && !((cpw)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
