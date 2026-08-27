import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzs extends cab {
   private final cdf a;
   @Nullable
   private bre b;
   private final cbu c = cbu.a().a(64.0);

   public bzs(cdf $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(byb.a.d));
   }

   @Override
   public boolean a() {
      eta $$0 = this.a.cI().c(10.0, 8.0, 10.0);
      List<? extends bre> $$1 = this.a.dN().a(cjy.class, this.c, this.a, $$0);
      List<ckl> $$2 = this.a.dN().a(this.c, this.a, $$0);

      for (bre $$3 : $$1) {
         cjy $$4 = (cjy)$$3;

         for (ckl $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof ckl) || !this.b.N_() && !((ckl)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
