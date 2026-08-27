import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgn extends ckg {
   private static final String c = "block.minecraft.banner.";

   public cgn(csl $$0, csl $$1, cis.a $$2) {
      super($$0, $$1, $$2, ha.a);
      Validate.isInstanceOf(crc.class, $$0);
      Validate.isInstanceOf(crc.class, $$1);
   }

   public static void a(cix $$0, List<tf> $$1) {
      qr $$2 = cgq.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         qx $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qr $$5 = $$3.a($$4);
            chl $$6 = chl.a($$5.h("Color"));
            he<dcc> $$7 = dcc.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(tf.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public chl b() {
      return ((crc)this.e()).a();
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      a($$0, $$2);
   }
}
