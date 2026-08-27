import java.util.Map;
import javax.annotation.Nullable;

public class cvb extends cro {
   protected final dea a;
   private final it b;

   public cvb(dea $$0, dea $$1, ctl.a $$2, it $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dbc $$0, drd $$1, io $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected drd c(cxb $$0) {
      drd $$1 = this.a.a($$0);
      drd $$2 = null;
      dbc $$3 = $$0.q();
      io $$4 = $$0.a();

      for (it $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            drd $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eur.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dea, ctl> $$0, ctl $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
