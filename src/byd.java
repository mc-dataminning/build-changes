import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class byd extends bym {
   private final cbq a;
   @Nullable
   private bpp b;
   private final caf c = caf.a().a(64.0);

   public byd(cbq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bwm.a.d));
   }

   @Override
   public boolean a() {
      epo $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bpp> $$1 = this.a.dM().a(cih.class, this.c, this.a, $$0);
      List<ciu> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bpp $$3 : $$1) {
         cih $$4 = (cih)$$3;

         for (ciu $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof ciu) || !this.b.N_() && !((ciu)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
