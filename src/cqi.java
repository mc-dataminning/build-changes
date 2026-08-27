import java.util.Map;
import javax.annotation.Nullable;

public class cqi extends cms {
   protected final cyo d;
   private final ie c;

   public cqi(cyo $$0, cyo $$1, cou.a $$2, ie $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cvq $$0, dlf $$1, hz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dlf c(crg $$0) {
      dlf $$1 = this.d.a($$0);
      dlf $$2 = null;
      cvq $$3 = $$0.q();
      hz $$4 = $$0.a();

      for (ie $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dlf $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, enx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cyo, cou> $$0, cou $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
