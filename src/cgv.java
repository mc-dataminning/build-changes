import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgv extends cko {
   private static final String c = "block.minecraft.banner.";

   public cgv(csv $$0, csv $$1, cja.a $$2) {
      super($$0, $$1, $$2, hc.a);
      Validate.isInstanceOf(crm.class, $$0);
      Validate.isInstanceOf(crm.class, $$1);
   }

   public static void a(cjf $$0, List<tm> $$1) {
      qy $$2 = cgy.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         re $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qy $$5 = $$3.a($$4);
            cht $$6 = cht.a($$5.h("Color"));
            hg<dcm> $$7 = dcm.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(tm.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cht b() {
      return ((crm)this.e()).a();
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      a($$0, $$2);
   }
}
