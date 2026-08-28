import java.util.List;
import org.apache.commons.lang3.Validate;

public class cuq extends cya {
   public cuq(djk $$0, djk $$1, cwj.a $$2) {
      super($$0, $$1, jn.a, $$2);
      Validate.isInstanceOf(dib.class, $$0);
      Validate.isInstanceOf(dib.class, $$1);
   }

   public static void a(cwn $$0, List<wo> $$1) {
      dto $$2 = $$0.a(kv.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dto.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cvk b() {
      return ((dib)this.d()).b();
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      a($$0, $$2);
   }
}
