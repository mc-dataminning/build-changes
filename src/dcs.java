import java.util.List;
import javax.annotation.Nullable;

public interface dcs {
   void a(btc<?> var1, azh var2);

   static void a(cur $$0, List<xp> $$1, String $$2) {
      xp $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xo.a);
         $$1.add(xp.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xo.a().b(xp.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xp a(cur $$0, String $$1) {
      us $$2 = $$0.a(km.O, cxg.a).d();
      alf $$3 = a($$2, $$1);
      return $$3 != null ? lp.g.b($$3).map($$0x -> xp.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static alf a(us $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return alf.a($$2);
      } else {
         return null;
      }
   }
}
