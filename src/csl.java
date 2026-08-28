import java.util.List;
import org.apache.commons.lang3.Validate;

public class csl extends cwe {
   public csl(dfy $$0, dfy $$1, cul.a $$2) {
      super($$0, $$1, $$2, ji.a);
      Validate.isInstanceOf(dep.class, $$0);
      Validate.isInstanceOf(dep.class, $$1);
   }

   public static void a(cuq $$0, List<wz> $$1) {
      dpy $$2 = $$0.a(kq.Y);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dpy.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cti b() {
      return ((dep)this.d()).b();
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      a($$0, $$2);
   }
}
