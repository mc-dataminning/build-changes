import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brs extends bsb {
   private final bvd a;
   @Nullable
   private bjg b;
   private final bts c = bts.a().a(64.0);

   public brs(bvd $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bqb.a.d));
   }

   @Override
   public boolean a() {
      ehi $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends bjg> $$1 = this.a.dL().a(cbh.class, this.c, this.a, $$0);
      List<cbu> $$2 = this.a.dL().a(this.c, this.a, $$0);

      for (bjg $$3 : $$1) {
         cbh $$4 = (cbh)$$3;

         for (cbu $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbu) || !this.b.M_() && !((cbu)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
