import java.util.Map;
import javax.annotation.Nullable;

public class crv extends coh {
   protected final dac d;
   private final ih c;

   public crv(dac $$0, dac $$1, cqh.a $$2, ih $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cxe $$0, dnb $$1, ib $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dnb c(csu $$0) {
      dnb $$1 = this.d.a($$0);
      dnb $$2 = null;
      cxe $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dnb $$6 = $$5 == this.c ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, epy.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dac, cqh> $$0, cqh $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
