import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cmt extends cqm {
   private static final String c = "block.minecraft.banner.";

   public cmt(cys $$0, cys $$1, coy.a $$2) {
      super($$0, $$1, $$2, ie.a);
      Validate.isInstanceOf(cxj.class, $$0);
      Validate.isInstanceOf(cxj.class, $$1);
   }

   public static void a(cpd $$0, List<vq> $$1) {
      sw $$2 = cmw.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         tc $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sw $$5 = $$3.a($$4);
            cnr $$6 = cnr.a($$5.h("Color"));
            ij<dio> $$7 = dio.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vq.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cnr b() {
      return ((cxj)this.e()).b();
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      a($$0, $$2);
   }
}
