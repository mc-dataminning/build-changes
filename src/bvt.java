import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bvt {
   public static bvy<cnc> a() {
      return bzk.a(
         (Function<bzk.b<cnc>, ? extends App<bzk.c<cnc>, bzn<cnc>>>)($$0 -> $$0.group($$0.b(cdi.d), $$0.a(cdi.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jm $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dq(), 2.0) && !$$4.gz()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gy().b() != cnf.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> lu.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gy().a($$2xx));
                                    $$4.a($$3);
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }
}
