import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bww extends bxf {
   private final caj a;
   @Nullable
   private boi b;
   private final byy c = byy.a().a(64.0);

   public bww(caj $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bvf.a.d));
   }

   @Override
   public boolean a() {
      enu $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends boi> $$1 = this.a.dM().a(cgy.class, this.c, this.a, $$0);
      List<chl> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (boi $$3 : $$1) {
         cgy $$4 = (cgy)$$3;

         for (chl $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof chl) || !this.b.P_() && !((chl)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
