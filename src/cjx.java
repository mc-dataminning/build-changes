import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cjx extends cnq {
   private static final String c = "block.minecraft.banner.";

   public cjx(cvz $$0, cvz $$1, cmc.a $$2) {
      super($$0, $$1, $$2, ia.a);
      Validate.isInstanceOf(cuq.class, $$0);
      Validate.isInstanceOf(cuq.class, $$1);
   }

   public static void a(cmh $$0, List<vb> $$1) {
      sj $$2 = cka.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         sp $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sj $$5 = $$3.a($$4);
            ckv $$6 = ckv.a($$5.h("Color"));
            ie<dfu> $$7 = dfu.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(vb.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public ckv b() {
      return ((cuq)this.e()).b();
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      a($$0, $$2);
   }
}
