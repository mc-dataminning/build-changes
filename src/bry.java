import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bry extends bsh {
   private final bvj a;
   @Nullable
   private bjm b;
   private final bty c = bty.a().a(64.0);

   public bry(bvj $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bqh.a.d));
   }

   @Override
   public boolean a() {
      ehc $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bjm> $$1 = this.a.dL().a(cbn.class, this.c, this.a, $$0);
      List<cca> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bjm $$3 : $$1) {
         cbn $$4 = (cbn)$$3;

         for (cca $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cca) || !this.b.M_() && !((cca)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
