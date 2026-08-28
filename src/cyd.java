import java.util.Map;
import javax.annotation.Nullable;

public class cyd extends cuw {
   protected final djn a;
   private final jn b;

   public cyd(djn $$0, djn $$1, jn $$2, cwm.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dgm $$0, dwy $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dwy c(dah $$0) {
      dwy $$1 = this.a.a($$0);
      dwy $$2 = null;
      dgm $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dwy $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbg.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<djn, cwm> $$0, cwm $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
