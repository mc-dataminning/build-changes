import java.util.Map;
import javax.annotation.Nullable;

public class cvo extends csc {
   protected final dfi a;
   private final jf b;

   public cvo(dfi $$0, dfi $$1, cty.a $$2, jf $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcj $$0, dsl $$1, ja $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dsl c(cxn $$0) {
      dsl $$1 = this.a.a($$0);
      dsl $$2 = null;
      dcj $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dsl $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ewm.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfi, cty> $$0, cty $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
