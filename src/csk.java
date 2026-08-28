import java.util.List;
import org.apache.commons.lang3.Validate;

public class csk extends cwa {
   public csk(dez $$0, dez $$1, cuk.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(ddq.class, $$0);
      Validate.isInstanceOf(ddq.class, $$1);
   }

   public static void a(cup $$0, List<xp> $$1) {
      doy $$2 = $$0.a(km.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            doy.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cti b() {
      return ((ddq)this.d()).b();
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      a($$0, $$2);
   }
}
