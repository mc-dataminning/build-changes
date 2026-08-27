import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class chb extends cku {
   private static final String c = "block.minecraft.banner.";

   public chb(ctc $$0, ctc $$1, cjg.a $$2) {
      super($$0, $$1, $$2, ha.a);
      Validate.isInstanceOf(crs.class, $$0);
      Validate.isInstanceOf(crs.class, $$1);
   }

   public static void a(cjl $$0, List<tl> $$1) {
      qw $$2 = che.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         rc $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qw $$5 = $$3.a($$4);
            chz $$6 = chz.a($$5.h("Color"));
            he<dcq> $$7 = dcq.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(tl.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public chz b() {
      return ((crs)this.e()).b();
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      a($$0, $$2);
   }
}
