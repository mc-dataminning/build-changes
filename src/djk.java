import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface djk {
   void a(bwj<?> var1, azt var2);

   static void a(dba $$0, Consumer<ww> $$1, String $$2) {
      ww $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(wv.a);
         $$1.accept(ww.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.accept(wv.a().b(ww.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static ww a(dba $$0, String $$1) {
      tx $$2 = $$0.e();
      ale $$3 = a($$2, $$1);
      return $$3 != null ? mf.f.b($$3).map($$0x -> ww.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ale a(tx $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ale.c($$2);
      } else {
         return null;
      }
   }
}
