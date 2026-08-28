import java.util.List;
import org.apache.commons.lang3.Validate;

public class csl extends cwb {
   public csl(dfa $$0, dfa $$1, cul.a $$2) {
      super($$0, $$1, $$2, je.a);
      Validate.isInstanceOf(ddr.class, $$0);
      Validate.isInstanceOf(ddr.class, $$1);
   }

   public static void a(cuq $$0, List<xp> $$1) {
      doz $$2 = $$0.a(km.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            doz.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public ctj b() {
      return ((ddr)this.d()).b();
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      a($$0, $$2);
   }
}
