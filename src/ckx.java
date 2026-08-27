import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckx extends coq {
   private static final String c = "block.minecraft.banner.";

   public ckx(cwy $$0, cwy $$1, cnb.a $$2) {
      super($$0, $$1, $$2, ic.a);
      Validate.isInstanceOf(cvp.class, $$0);
      Validate.isInstanceOf(cvp.class, $$1);
   }

   public static void a(cng $$0, List<vg> $$1) {
      so $$2 = cla.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         su $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            so $$5 = $$3.a($$4);
            clv $$6 = clv.a($$5.h("Color"));
            ih<dgu> $$7 = dgu.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vg.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public clv b() {
      return ((cvp)this.e()).b();
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      a($$0, $$2);
   }
}
