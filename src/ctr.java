import java.util.List;
import org.apache.commons.lang3.Validate;

public class ctr extends cxf {
   public ctr(dhm $$0, dhm $$1, cvn.a $$2) {
      super($$0, $$1, $$2, jk.a);
      Validate.isInstanceOf(dgd.class, $$0);
      Validate.isInstanceOf(dgd.class, $$1);
   }

   public static void a(cvs $$0, List<xe> $$1) {
      drm $$2 = $$0.a(ks.ad);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            drm.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cum b() {
      return ((dgd)this.d()).b();
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      a($$0, $$2);
   }
}
