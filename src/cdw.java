import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdw extends cef {
   private final chk a;
   @Nullable
   private bvh b;
   private final cfy c = cfy.a().a(64.0);

   public cdw(chk $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.d));
   }

   @Override
   public boolean b() {
      ezt $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      arp $$1 = a(this.a);
      List<? extends bvh> $$2 = $$1.a(cof.class, this.c, this.a, $$0);
      List<cou> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvh $$4 : $$2) {
         cof $$5 = (cof)$$4;

         for (cou $$6 : $$3) {
            int $$7 = $$5.f($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cou) || !this.b.Y_() && !((cou)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
