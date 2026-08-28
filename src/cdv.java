import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdv extends cee {
   private final chj a;
   @Nullable
   private bvg b;
   private final cfx c = cfx.a().a(64.0);

   public cdv(chj $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cce.a.d));
   }

   @Override
   public boolean b() {
      fau $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ard $$1 = a(this.a);
      List<? extends bvg> $$2 = $$1.a(coh.class, this.c, this.a, $$0);
      List<cow> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvg $$4 : $$2) {
         coh $$5 = (coh)$$4;

         for (cow $$6 : $$3) {
            int $$7 = $$5.g($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cow) || !this.b.Z_() && !((cow)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
