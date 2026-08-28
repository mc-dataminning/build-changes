import java.util.List;
import javax.annotation.Nullable;

public interface did {
   void a(bvr<?> var1, bam var2);

   static void a(cxp $$0, List<xv> $$1, String $$2) {
      xv $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xu.a);
         $$1.add(xv.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xu.a().b(xv.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xv a(cxp $$0, String $$1) {
      ux $$2 = $$0.a(ku.Y, czy.a).d();
      alz $$3 = a($$2, $$1);
      return $$3 != null ? ma.f.b($$3).map($$0x -> xv.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alz a(ux $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alz.c($$2);
      } else {
         return null;
      }
   }
}
