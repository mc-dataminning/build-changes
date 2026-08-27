import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cmp extends cqi {
   private static final String c = "block.minecraft.banner.";

   public cmp(cyo $$0, cyo $$1, cou.a $$2) {
      super($$0, $$1, $$2, ie.a);
      Validate.isInstanceOf(cxf.class, $$0);
      Validate.isInstanceOf(cxf.class, $$1);
   }

   public static void a(coz $$0, List<vq> $$1) {
      sw $$2 = cms.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         tc $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sw $$5 = $$3.a($$4);
            cnn $$6 = cnn.a($$5.h("Color"));
            ij<dik> $$7 = dik.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vq.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cnn b() {
      return ((cxf)this.e()).b();
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      a($$0, $$2);
   }
}
