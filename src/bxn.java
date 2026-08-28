import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bxn {
   public static bxs<cpd> a() {
      return cbe.a(
         (Function<cbe.b<cpd>, ? extends App<cbe.c<cpd>, cbh<cpd>>>)($$0 -> $$0.group($$0.b(cfc.d), $$0.a(cfc.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.ds(), 2.0) && !$$4.gC()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gA().b() != cpg.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.A().c($$6.b()))
                                 .flatMap($$0xxx -> mb.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gA().a($$2xx));
                                    $$4.g($$3);
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }
}
