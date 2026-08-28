import java.util.List;
import org.apache.commons.lang3.Validate;

public class cti extends cwz {
   public cti(dgv $$0, dgv $$1, cvg.a $$2) {
      super($$0, $$1, $$2, jj.a);
      Validate.isInstanceOf(dfm.class, $$0);
      Validate.isInstanceOf(dfm.class, $$1);
   }

   public static void a(cvl $$0, List<xd> $$1) {
      dqv $$2 = $$0.a(kr.aa);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dqv.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cue b() {
      return ((dfm)this.d()).b();
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      a($$0, $$2);
   }
}
