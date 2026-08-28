import java.util.List;
import org.apache.commons.lang3.Validate;

public class csj extends cwc {
   public csj(dfw $$0, dfw $$1, cuj.a $$2) {
      super($$0, $$1, $$2, ji.a);
      Validate.isInstanceOf(den.class, $$0);
      Validate.isInstanceOf(den.class, $$1);
   }

   public static void a(cuo $$0, List<wy> $$1) {
      dpw $$2 = $$0.a(kq.Y);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dpw.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public ctg b() {
      return ((den)this.d()).b();
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      a($$0, $$2);
   }
}
