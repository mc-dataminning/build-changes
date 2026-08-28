import java.util.List;
import org.apache.commons.lang3.Validate;

public class cwc extends czj {
   public cwc(dku $$0, dku $$1, cxu.a $$2) {
      super($$0, $$1, jo.a, $$2);
      Validate.isInstanceOf(djl.class, $$0);
      Validate.isInstanceOf(djl.class, $$1);
   }

   public static void a(cxy $$0, List<wv> $$1) {
      dvb $$2 = $$0.a(kx.ak);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dvb.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwv b() {
      return ((djl)this.d()).b();
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      a($$0, $$2);
   }
}
