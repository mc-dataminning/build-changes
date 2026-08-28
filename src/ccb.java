import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccb extends cck {
   private final cfo a;
   @Nullable
   private btl b;
   private final ced c = ced.a().a(64.0);

   public ccb(cfo $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cak.a.d));
   }

   @Override
   public boolean b() {
      ewr $$0 = this.a.cL().c(10.0, 8.0, 10.0);
      List<? extends btl> $$1 = this.a.dQ().a(cmi.class, this.c, this.a, $$0);
      List<cmv> $$2 = this.a.dQ().a(this.c, this.a, $$0);

      for (btl $$3 : $$1) {
         cmi $$4 = (cmi)$$3;

         for (cmv $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmv) || !this.b.N_() && !((cmv)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
