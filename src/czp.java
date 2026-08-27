import java.util.List;
import javax.annotation.Nullable;

public interface czp {
   void a(bqb<?> var1, axr var2);

   static void a(crj $$0, List<wg> $$1, String $$2) {
      wg $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(wf.a);
         $$1.add(wg.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(wf.a().b(wg.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static wg a(crj $$0, String $$1) {
      tm $$2 = $$0.a(jp.F, ctt.a).d();
      ajt $$3 = a($$2, $$1);
      return $$3 != null ? kr.g.b($$3).map($$0x -> wg.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ajt a(tm $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ajt.a($$2);
      } else {
         return null;
      }
   }
}
