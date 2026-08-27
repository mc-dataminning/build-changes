import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cko extends coh {
   private static final String c = "block.minecraft.banner.";

   public cko(cwq $$0, cwq $$1, cmt.a $$2) {
      super($$0, $$1, $$2, ic.a);
      Validate.isInstanceOf(cvh.class, $$0);
      Validate.isInstanceOf(cvh.class, $$1);
   }

   public static void a(cmy $$0, List<vf> $$1) {
      sn $$2 = ckr.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         st $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sn $$5 = $$3.a($$4);
            clm $$6 = clm.a($$5.h("Color"));
            ih<dgm> $$7 = dgm.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vf.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public clm b() {
      return ((cvh)this.e()).b();
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      a($$0, $$2);
   }
}
