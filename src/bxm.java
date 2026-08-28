import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bxm {
   public static bxr<cpa> a() {
      return cbd.a(
         (Function<cbd.b<cpa>, ? extends App<cbd.c<cpa>, cbg<cpa>>>)($$0 -> $$0.group($$0.b(cfb.d), $$0.a(cfb.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jp $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.du(), 2.0) && !$$4.gz()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gy().b() != cpd.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.A().c($$6.b()))
                                 .flatMap($$0xxx -> ma.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gy().a($$2xx));
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
