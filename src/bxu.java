import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bxu {
   public static bxz<cpi> a() {
      return cbl.a(
         (Function<cbl.b<cpi>, ? extends App<cbl.c<cpi>, cbo<cpi>>>)($$0 -> $$0.group($$0.b(cfj.d), $$0.a(cfj.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dt(), 2.0) && !$$4.gx()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gw().b() != cpl.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.z().c($$6.b()))
                                 .flatMap($$0xxx -> ma.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gw().a($$2xx));
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
