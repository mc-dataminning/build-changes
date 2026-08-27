import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bmt {
   public static bmy<cdh> a() {
      return bqj.a(
         (Function<bqj.b<cdh>, ? extends App<bqj.c<cdh>, bqm<cdh>>>)($$0 -> $$0.group($$0.b(buh.d), $$0.a(buh.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ia $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dl(), 2.0) && !$$4.gp()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gq().b() != cdk.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.n();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.x().c($$6.b()))
                                 .flatMap($$0xxx -> jy.A.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gq().a($$2xx));
                                    $$4.c($$3);
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }
}
