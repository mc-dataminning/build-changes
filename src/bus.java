import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bus extends bvb {
   private final bye a;
   @Nullable
   private bmf b;
   private final bwt c = bwt.a().a(64.0);

   public bus(bye $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(btb.a.d));
   }

   @Override
   public boolean a() {
      elh $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bmf> $$1 = this.a.dM().a(ceo.class, this.c, this.a, $$0);
      List<cfb> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bmf $$3 : $$1) {
         ceo $$4 = (ceo)$$3;

         for (cfb $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cfb) || !this.b.P_() && !((cfb)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
