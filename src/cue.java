import java.util.List;
import org.apache.commons.lang3.Validate;

public class cue extends cxo {
   public cue(die $$0, die $$1, cvx.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(dgv.class, $$0);
      Validate.isInstanceOf(dgv.class, $$1);
   }

   public static void a(cwb $$0, List<xi> $$1) {
      dsd $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dsd.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cuy b() {
      return ((dgv)this.d()).b();
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      a($$0, $$2);
   }
}
