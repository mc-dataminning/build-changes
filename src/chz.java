import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class chz extends cls {
   private static final String c = "block.minecraft.banner.";

   public chz(cua $$0, cua $$1, cke.a $$2) {
      super($$0, $$1, $$2, hx.a);
      Validate.isInstanceOf(csq.class, $$0);
      Validate.isInstanceOf(csq.class, $$1);
   }

   public static void a(ckj $$0, List<ui> $$1) {
      rt $$2 = cic.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         rz $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            rt $$5 = $$3.a($$4);
            cix $$6 = cix.a($$5.h("Color"));
            ib<ddo> $$7 = ddo.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(ui.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cix b() {
      return ((csq)this.e()).b();
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      a($$0, $$2);
   }
}
