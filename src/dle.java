import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dle {
   void a(bxn<?> var1, bai var2);

   static void a(dcs $$0, Consumer<xg> $$1, String $$2) {
      xg $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(xf.a);
         $$1.accept(xg.c("block.minecraft.spawner.desc1").a(o.h));
         $$1.accept(xf.a().b(xg.c("block.minecraft.spawner.desc2").a(o.j)));
      }
   }

   @Nullable
   static xg a(dcs $$0, String $$1) {
      return $$0.e().m($$1).flatMap($$0x -> $$0x.m("entity")).flatMap($$0x -> $$0x.a("id", bxn.a)).map($$0x -> xg.c($$0x.g()).a(o.h)).orElse(null);
   }
}
