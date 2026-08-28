import java.util.List;
import org.apache.commons.lang3.Validate;

public class cui extends cxs {
   public cui(dij $$0, dij $$1, cwb.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(dha.class, $$0);
      Validate.isInstanceOf(dha.class, $$1);
   }

   public static void a(cwf $$0, List<xl> $$1) {
      dsi $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dsi.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvc b() {
      return ((dha)this.d()).b();
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      a($$0, $$2);
   }
}
