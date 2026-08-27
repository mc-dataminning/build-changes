import java.util.Map;
import javax.annotation.Nullable;

public class ckj extends cgt {
   protected final csq d;
   private final hc c;

   public ckj(csq $$0, csq $$1, civ.a $$2, hc $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cpt $$0, dfe $$1, gw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dfe c(cli $$0) {
      dfe $$1 = this.d.a($$0);
      dfe $$2 = null;
      cpt $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (hc $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dfe $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehn.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csq, civ> $$0, civ $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
