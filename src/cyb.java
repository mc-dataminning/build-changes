import java.util.Map;
import javax.annotation.Nullable;

public class cyb extends cuu {
   protected final djl a;
   private final jn b;

   public cyb(djl $$0, djl $$1, jn $$2, cwk.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dgk $$0, dww $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dww c(daf $$0) {
      dww $$1 = this.a.a($$0);
      dww $$2 = null;
      dgk $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dww $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbe.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<djl, cwk> $$0, cwk $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
