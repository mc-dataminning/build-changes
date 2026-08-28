import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dku {
   void a(bxe<?> var1, azz var2);

   static void a(dci $$0, Consumer<xc> $$1, String $$2) {
      xc $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(xb.a);
         $$1.accept(xc.c("block.minecraft.spawner.desc1").a(o.h));
         $$1.accept(xb.a().b(xc.c("block.minecraft.spawner.desc2").a(o.j)));
      }
   }

   @Nullable
   static xc a(dci $$0, String $$1) {
      return $$0.e().m($$1).flatMap($$0x -> $$0x.m("entity")).flatMap($$0x -> $$0x.a("id", bxe.a)).map($$0x -> xc.c($$0x.g()).a(o.h)).orElse(null);
   }
}
