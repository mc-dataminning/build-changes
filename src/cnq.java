import java.util.Map;
import javax.annotation.Nullable;

public class cnq extends cka {
   protected final cvz d;
   private final ia c;

   public cnq(cvz $$0, cvz $$1, cmc.a $$2, ia $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(ctb $$0, dip $$1, hv $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dip c(coq $$0) {
      dip $$1 = this.d.a($$0);
      dip $$2 = null;
      ctb $$3 = $$0.q();
      hv $$4 = $$0.a();

      for (ia $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dip $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, elg.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cvz, cmc> $$0, cmc $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
