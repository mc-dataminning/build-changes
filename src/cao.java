import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cao extends cax {
   private final ceb a;
   @Nullable
   private bsa b;
   private final ccq c = ccq.a().a(64.0);

   public cao(ceb $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(byx.a.d));
   }

   @Override
   public boolean a() {
      etk $$0 = this.a.cI().c(10.0, 8.0, 10.0);
      List<? extends bsa> $$1 = this.a.dN().a(cku.class, this.c, this.a, $$0);
      List<clh> $$2 = this.a.dN().a(this.c, this.a, $$0);

      for (bsa $$3 : $$1) {
         cku $$4 = (cku)$$3;

         for (clh $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof clh) || !this.b.N_() && !((clh)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
