import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bwb {
   public static bwg<cnk> a() {
      return bzs.a(
         (Function<bzs.b<cnk>, ? extends App<bzs.c<cnk>, bzv<cnk>>>)($$0 -> $$0.group($$0.b(cdq.d), $$0.a(cdq.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jn $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dq(), 2.0) && !$$4.gz()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gy().b() != cnn.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> lv.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
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
