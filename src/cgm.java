import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgm extends ckf {
   private static final String c = "block.minecraft.banner.";

   public cgm(csk $$0, csk $$1, cir.a $$2) {
      super($$0, $$1, $$2, hb.a);
      Validate.isInstanceOf(crb.class, $$0);
      Validate.isInstanceOf(crb.class, $$1);
   }

   public static void a(ciw $$0, List<te> $$1) {
      qs $$2 = cgp.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         qy $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qs $$5 = $$3.a($$4);
            chk $$6 = chk.a($$5.h("Color"));
            hf<dcb> $$7 = dcb.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(te.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public chk b() {
      return ((crb)this.e()).a();
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      a($$0, $$2);
   }
}
