import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brk extends brt {
   private final buv a;
   @Nullable
   private biy b;
   private final btk c = btk.a().a(64.0);

   public brk(buv $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bpt.a.d));
   }

   @Override
   public boolean a() {
      egy $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends biy> $$1 = this.a.dK().a(caz.class, this.c, this.a, $$0);
      List<cbm> $$2 = this.a.dK().a(this.c, this.a, $$0);

      for (biy $$3 : $$1) {
         caz $$4 = (caz)$$3;

         for (cbm $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbm) || !this.b.G_() && !((cbm)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
