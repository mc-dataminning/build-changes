import java.util.List;
import javax.annotation.Nullable;

public interface dik {
   void a(bwb<?> var1, azs var2);

   static void a(cxy $$0, List<wv> $$1, String $$2) {
      wv $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wu.a);
         $$1.add(wv.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wu.a().b(wv.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wv a(cxy $$0, String $$1) {
      tw $$2 = $$0.a(kx.aa, dae.a).e();
      ald $$3 = a($$2, $$1);
      return $$3 != null ? md.f.b($$3).map($$0x -> wv.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ald a(tw $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ald.c($$2);
      } else {
         return null;
      }
   }
}
