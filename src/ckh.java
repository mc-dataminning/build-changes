import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckh extends coa {
   private static final String c = "block.minecraft.banner.";

   public ckh(cwj $$0, cwj $$1, cmm.a $$2) {
      super($$0, $$1, $$2, ic.a);
      Validate.isInstanceOf(cva.class, $$0);
      Validate.isInstanceOf(cva.class, $$1);
   }

   public static void a(cmr $$0, List<vd> $$1) {
      sl $$2 = ckk.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         sr $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sl $$5 = $$3.a($$4);
            clf $$6 = clf.a($$5.h("Color"));
            ih<dgf> $$7 = dgf.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vd.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public clf b() {
      return ((cva)this.e()).b();
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      a($$0, $$2);
   }
}
