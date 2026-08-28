import java.util.Map;
import javax.annotation.Nullable;

public class cya extends cut {
   protected final djk b;
   private final jn c;

   public cya(djk $$0, djk $$1, jn $$2, cwj.a $$3) {
      super($$0, $$3);
      this.b = $$1;
      this.c = $$2;
   }

   protected boolean a(dgj $$0, dwv $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dwv c(dae $$0) {
      dwv $$1 = this.b.a($$0);
      dwv $$2 = null;
      dgj $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dwv $$6 = $$5 == this.c ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbd.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<djk, cwj> $$0, cwj $$1) {
      super.a($$0, $$1);
      $$0.put(this.b, $$1);
   }
}
