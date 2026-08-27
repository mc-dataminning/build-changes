import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cir extends cmk {
   private static final String c = "block.minecraft.banner.";

   public cir(cut $$0, cut $$1, ckw.a $$2) {
      super($$0, $$1, $$2, hx.a);
      Validate.isInstanceOf(ctj.class, $$0);
      Validate.isInstanceOf(ctj.class, $$1);
   }

   public static void a(clb $$0, List<ur> $$1) {
      rz $$2 = ciu.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         sf $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            rz $$5 = $$3.a($$4);
            cjp $$6 = cjp.a($$5.h("Color"));
            ib<dei> $$7 = dei.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(ur.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cjp b() {
      return ((ctj)this.e()).b();
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      a($$0, $$2);
   }
}
