import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdx extends ceg {
   private final chl a;
   @Nullable
   private bvi b;
   private final cfz c = cfz.a().a(64.0);

   public cdx(chl $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccg.a.d));
   }

   @Override
   public boolean b() {
      faw $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ard $$1 = a(this.a);
      List<? extends bvi> $$2 = $$1.a(coj.class, this.c, this.a, $$0);
      List<coy> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvi $$4 : $$2) {
         coj $$5 = (coj)$$4;

         for (coy $$6 : $$3) {
            int $$7 = $$5.g($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof coy) || !this.b.Z_() && !((coy)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
