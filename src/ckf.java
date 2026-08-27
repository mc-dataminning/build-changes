import java.util.Map;
import javax.annotation.Nullable;

public class ckf extends cgp {
   protected final csk d;
   private final hb c;

   public ckf(csk $$0, csk $$1, cir.a $$2, hb $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cpn $$0, dey $$1, gv $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dey c(cle $$0) {
      dey $$1 = this.d.a($$0);
      dey $$2 = null;
      cpn $$3 = $$0.q();
      gv $$4 = $$0.a();

      for (hb $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dey $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehk.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csk, cir> $$0, cir $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
