import java.util.Map;
import javax.annotation.Nullable;

public class cmk extends ciu {
   protected final cut d;
   private final hx c;

   public cmk(cut $$0, cut $$1, ckw.a $$2, hx $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(crv $$0, dgw $$1, ht $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dgw c(cnj $$0) {
      dgw $$1 = this.d.a($$0);
      dgw $$2 = null;
      crv $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dgw $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ejn.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cut, ckw> $$0, ckw $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
