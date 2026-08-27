import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckn extends cog {
   private static final String c = "block.minecraft.banner.";

   public ckn(cwp $$0, cwp $$1, cms.a $$2) {
      super($$0, $$1, $$2, ic.a);
      Validate.isInstanceOf(cvg.class, $$0);
      Validate.isInstanceOf(cvg.class, $$1);
   }

   public static void a(cmx $$0, List<vf> $$1) {
      sn $$2 = ckq.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         st $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sn $$5 = $$3.a($$4);
            cll $$6 = cll.a($$5.h("Color"));
            ih<dgl> $$7 = dgl.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vf.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cll b() {
      return ((cvg)this.e()).b();
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      a($$0, $$2);
   }
}
