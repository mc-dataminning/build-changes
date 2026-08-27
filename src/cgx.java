import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgx extends ckq {
   private static final String c = "block.minecraft.banner.";

   public cgx(csx $$0, csx $$1, cjc.a $$2) {
      super($$0, $$1, $$2, hc.a);
      Validate.isInstanceOf(cro.class, $$0);
      Validate.isInstanceOf(cro.class, $$1);
   }

   public static void a(cjh $$0, List<tn> $$1) {
      qy $$2 = cha.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         re $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qy $$5 = $$3.a($$4);
            chv $$6 = chv.a($$5.h("Color"));
            hg<dco> $$7 = dco.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(tn.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public chv b() {
      return ((cro)this.e()).a();
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      a($$0, $$2);
   }
}
