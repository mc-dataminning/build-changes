import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bws extends bxb {
   private final caf a;
   @Nullable
   private bog b;
   private final byu c = byu.a().a(64.0);

   public bws(caf $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.d));
   }

   @Override
   public boolean a() {
      enn $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bog> $$1 = this.a.dM().a(cgu.class, this.c, this.a, $$0);
      List<chh> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bog $$3 : $$1) {
         cgu $$4 = (cgu)$$3;

         for (chh $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof chh) || !this.b.P_() && !((chh)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
