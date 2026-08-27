import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brn extends brw {
   private final buy a;
   @Nullable
   private bjb b;
   private final btn c = btn.a().a(64.0);

   public brn(buy $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bpw.a.d));
   }

   @Override
   public boolean a() {
      ehd $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bjb> $$1 = this.a.dK().a(cbc.class, this.c, this.a, $$0);
      List<cbp> $$2 = this.a.dK().a(this.c, this.a, $$0);

      for (bjb $$3 : $$1) {
         cbc $$4 = (cbc)$$3;

         for (cbp $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbp) || !this.b.G_() && !((cbp)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
