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
      fav $$0 = this.a.cR().c(10.0, 8.0, 10.0);
      ard $$1 = a(this.a);
      List<? extends bvh> $$2 = $$1.a(coi.class, this.c, this.a, $$0);
      List<cox> $$3 = $$1.a(this.c, this.a, $$0);

      for (bvh $$4 : $$2) {
         coi $$5 = (coi)$$4;

         for (cox $$6 : $$3) {
            int $$7 = $$5.g($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cox) || !this.b.Z_() && !((cox)this.b).b();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
