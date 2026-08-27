import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class coe extends crv {
   private static final String c = "block.minecraft.banner.";

   public coe(dac $$0, dac $$1, cqh.a $$2) {
      super($$0, $$1, $$2, ih.a);
      Validate.isInstanceOf(cyt.class, $$0);
      Validate.isInstanceOf(cyt.class, $$1);
   }

   public static void a(cqm $$0, List<vu> $$1) {
      ta $$2 = coh.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         tg $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            ta $$5 = $$3.a($$4);
            cpd $$6 = cpd.a($$5.h("Color"));
            il<djz> $$7 = djz.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vu.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cpd b() {
      return ((cyt)this.d()).b();
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      a($$0, $$2);
   }
}
