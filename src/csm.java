import java.util.List;
import org.apache.commons.lang3.Validate;

public class csm extends cwc {
   public csm(dfb $$0, dfb $$1, cum.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(dds.class, $$0);
      Validate.isInstanceOf(dds.class, $$1);
   }

   public static void a(cur $$0, List<xp> $$1) {
      dpa $$2 = $$0.a(km.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dpa.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public ctk b() {
      return ((dds)this.d()).b();
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      a($$0, $$2);
   }
}
