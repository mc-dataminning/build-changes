import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cpe extends csr {
   private static final String b = "block.minecraft.banner.";

   public cpe(dby $$0, dby $$1, cre.a $$2) {
      super($$0, $$1, $$2, ih.a);
      Validate.isInstanceOf(dap.class, $$0);
      Validate.isInstanceOf(dap.class, $$1);
   }

   public static void a(crj $$0, List<wg> $$1) {
      dlw $$2 = $$0.a(jp.N);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dlw.b $$4 = $$2.b().get($$3);
            $$4.a().e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(wg.c("block.minecraft.banner." + $$2x + "." + $$4.b().b()).a(n.h)));
         }
      }
   }

   public cqc b() {
      return ((dap)this.d()).b();
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      a($$0, $$2);
   }
}
