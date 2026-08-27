import java.util.Map;
import javax.annotation.Nullable;

public class cko extends cgy {
   protected final csv d;
   private final hc c;

   public cko(csv $$0, csv $$1, cja.a $$2, hc $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cpy $$0, dfj $$1, gw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dfj c(cln $$0) {
      dfj $$1 = this.d.a($$0);
      dfj $$2 = null;
      cpy $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (hc $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dfj $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehs.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<csv, cja> $$0, cja $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
