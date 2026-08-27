import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cgq extends ckj {
   private static final String c = "block.minecraft.banner.";

   public cgq(csq $$0, csq $$1, civ.a $$2) {
      super($$0, $$1, $$2, hc.a);
      Validate.isInstanceOf(crh.class, $$0);
      Validate.isInstanceOf(crh.class, $$1);
   }

   public static void a(cja $$0, List<ti> $$1) {
      qu $$2 = cgt.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         ra $$3 = $$2.c("Patterns", 10);

         for (int $$4 = 0; $$4 < $$3.size() && $$4 < 6; $$4++) {
            qu $$5 = $$3.a($$4);
            cho $$6 = cho.a($$5.h("Color"));
            hg<dch> $$7 = dch.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(ti.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(n.h)));
            }
         }
      }
   }

   public cho b() {
      return ((crh)this.e()).a();
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      a($$0, $$2);
   }
}
