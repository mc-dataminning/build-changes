import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cct extends cdc {
   private final cgh a;
   @Nullable
   private buf b;
   private final cev c = cev.a().a(64.0);

   public cct(cgh $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.d));
   }

   @Override
   public boolean b() {
      exz $$0 = this.a.cO().c(10.0, 8.0, 10.0);
      List<? extends buf> $$1 = this.a.dS().a(cnc.class, this.c, this.a, $$0);
      List<cnp> $$2 = this.a.dS().a(this.c, this.a, $$0);

      for (buf $$3 : $$1) {
         cnc $$4 = (cnc)$$3;

         for (cnp $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cnp) || !this.b.P_() && !((cnp)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
