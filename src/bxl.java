import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bxl extends bxu {
   private final cay a;
   @Nullable
   private box b;
   private final bzn c = bzn.a().a(64.0);

   public bxl(cay $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.d));
   }

   @Override
   public boolean a() {
      eoq $$0 = this.a.cE().c(10.0, 8.0, 10.0);
      List<? extends box> $$1 = this.a.dJ().a(chn.class, this.c, this.a, $$0);
      List<cia> $$2 = this.a.dJ().a(this.c, this.a, $$0);

      for (box $$3 : $$1) {
         chn $$4 = (chn)$$3;

         for (cia $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cia) || !this.b.P_() && !((cia)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
