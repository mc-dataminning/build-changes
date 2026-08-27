import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgo extends ckh {
   private static final String c = "block.minecraft.banner.";

   public cgo(csm $$0, csm $$1, cit.a $$2) {
      super($$0, $$1, $$2, ha.a);
      Validate.isInstanceOf(crd.class, $$0);
      Validate.isInstanceOf(crd.class, $$1);
   }

   public static void a(ciy $$0, List<tf> $$1) {
      qr $$2 = cgr.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         qx $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qr $$5 = $$3.a($$4);
            chm $$6 = chm.a($$5.h("Color"));
            he<dcd> $$7 = dcd.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(tf.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public chm b() {
      return ((crd)this.e()).a();
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      a($$0, $$2);
   }
}
