import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bye {
   public static byj<cpu> a() {
      return cbv.a(
         (Function<cbv.b<cpu>, ? extends App<cbv.c<cpu>, cby<cpu>>>)($$0 -> $$0.group($$0.b(cft.d), $$0.a(cft.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jr $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dt(), 2.0) && !$$4.gA()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if (!$$4.gy().b().a(cpx.b)) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.A().c($$6.b()))
                                 .flatMap($$0xxx -> md.x.c().filter($$1xx -> ((cpx)$$1xx.a()).b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gy().b($$2xx));
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
