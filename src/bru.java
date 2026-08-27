import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bru extends bsd {
   private final bvf a;
   @Nullable
   private bji b;
   private final btu c = btu.a().a(64.0);

   public bru(bvf $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bqd.a.d));
   }

   @Override
   public boolean a() {
      ehk $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bji> $$1 = this.a.dL().a(cbj.class, this.c, this.a, $$0);
      List<cbw> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bji $$3 : $$1) {
         cbj $$4 = (cbj)$$3;

         for (cbw $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbw) || !this.b.M_() && !((cbw)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
