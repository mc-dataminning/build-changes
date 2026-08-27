import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cdp extends chi {
   private static final String c = "block.minecraft.banner.";

   public cdp(cpn $$0, cpn $$1, cfu.a $$2) {
      super($$0, $$1, $$2, ha.a);
      Validate.isInstanceOf(cod.class, $$0);
      Validate.isInstanceOf(cod.class, $$1);
   }

   public static void a(cfz $$0, List<sw> $$1) {
      qr $$2 = cds.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         qx $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qr $$5 = $$3.a($$4);
            cen $$6 = cen.a($$5.h("Color"));
            he<cze> $$7 = cze.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(sw.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cen b() {
      return ((cod)this.e()).a();
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      a($$0, $$2);
   }
}
