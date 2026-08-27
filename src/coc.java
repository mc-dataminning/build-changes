import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class coc extends crt {
   private static final String c = "block.minecraft.banner.";

   public coc(daa $$0, daa $$1, cqf.a $$2) {
      super($$0, $$1, $$2, ih.a);
      Validate.isInstanceOf(cyr.class, $$0);
      Validate.isInstanceOf(cyr.class, $$1);
   }

   public static void a(cqk $$0, List<vu> $$1) {
      ta $$2 = cof.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         tg $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            ta $$5 = $$3.a($$4);
            cpb $$6 = cpb.a($$5.h("Color"));
            il<djx> $$7 = djx.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vu.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cpb b() {
      return ((cyr)this.d()).b();
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      a($$0, $$2);
   }
}
