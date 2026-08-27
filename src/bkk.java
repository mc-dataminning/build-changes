import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bkk {
   public static bkp<cay> a() {
      return boa.a(
         (Function<boa.b<cay>, ? extends App<boa.c<cay>, bod<cay>>>)($$0 -> $$0.group($$0.b(bry.d), $$0.a(bry.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        he $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.di(), 2.0) && !$$4.gj()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gk().b() != cbb.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.n();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.w().c($$6.b()))
                                 .flatMap($$0xxx -> jc.A.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gk().a($$2xx));
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
