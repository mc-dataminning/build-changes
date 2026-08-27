import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cje extends cmx {
   private static final String c = "block.minecraft.banner.";

   public cje(cvf $$0, cvf $$1, clj.a $$2) {
      super($$0, $$1, $$2, ib.a);
      Validate.isInstanceOf(ctw.class, $$0);
      Validate.isInstanceOf(ctw.class, $$1);
   }

   public static void a(clo $$0, List<uv> $$1) {
      sd $$2 = cjh.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         sj $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            sd $$5 = $$3.a($$4);
            ckc $$6 = ckc.a($$5.h("Color"));
            ig<dez> $$7 = dez.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(uv.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public ckc b() {
      return ((ctw)this.e()).b();
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      a($$0, $$2);
   }
}
