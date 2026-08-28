import java.util.List;
import javax.annotation.Nullable;

public interface dco {
   void a(bsy<?> var1, azf var2);

   static void a(cun $$0, List<xo> $$1, String $$2) {
      xo $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.add($$3);
      } else {
         $$1.add(xn.a);
         $$1.add(xo.c("block.minecraft.spawner.desc1").a(n.h));
         $$1.add(xn.a().b(xo.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   @Nullable
   static xo a(cun $$0, String $$1) {
      ur $$2 = $$0.a(km.N, cxc.a).d();
      ale $$3 = a($$2, $$1);
      return $$3 != null ? lp.g.b($$3).map($$0x -> xo.c($$0x.g()).a(n.h)).orElse(null) : null;
   }

   @Nullable
   private static ale a(ur $$0, String $$1) {
      if ($$0.b($$1, 10)) {
         String $$2 = $$0.p($$1).p("entity").l("id");
         return ale.a($$2);
      } else {
         return null;
      }
   }
}
