import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dks {
   void a(bxc<?> var1, azx var2);

   static void a(dcg $$0, Consumer<xa> $$1, String $$2) {
      xa $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(wz.a);
         $$1.accept(xa.c("block.minecraft.spawner.desc1").a(o.h));
         $$1.accept(wz.a().b(xa.c("block.minecraft.spawner.desc2").a(o.j)));
      }
   }

   @Nullable
   static xa a(dcg $$0, String $$1) {
      return $$0.e().m($$1).flatMap($$0x -> $$0x.m("entity")).flatMap($$0x -> $$0x.a("id", bxc.a)).map($$0x -> xa.c($$0x.g()).a(o.h)).orElse(null);
   }
}
