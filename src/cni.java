import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cni extends cqz {
   private static final String c = "block.minecraft.banner.";

   public cni(czf $$0, czf $$1, cpl.a $$2) {
      super($$0, $$1, $$2, ih.a);
      Validate.isInstanceOf(cxw.class, $$0);
      Validate.isInstanceOf(cxw.class, $$1);
   }

   public static void a(cpq $$0, List<vs> $$1) {
      sy $$2 = cnl.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         te $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sy $$5 = $$3.a($$4);
            cog $$6 = cog.a($$5.h("Color"));
            il<djc> $$7 = djc.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vs.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cog b() {
      return ((cxw)this.d()).b();
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      a($$0, $$2);
   }
}
