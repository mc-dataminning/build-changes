import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ciz extends cms {
   private static final String c = "block.minecraft.banner.";

   public ciz(cva $$0, cva $$1, cle.a $$2) {
      super($$0, $$1, $$2, hx.a);
      Validate.isInstanceOf(ctr.class, $$0);
      Validate.isInstanceOf(ctr.class, $$1);
   }

   public static void a(clj $$0, List<ur> $$1) {
      rz $$2 = cjc.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         sf $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            rz $$5 = $$3.a($$4);
            cjx $$6 = cjx.a($$5.h("Color"));
            ib<deu> $$7 = deu.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(ur.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cjx b() {
      return ((ctr)this.e()).b();
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      a($$0, $$2);
   }
}
