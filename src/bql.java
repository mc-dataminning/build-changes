import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bql {
   public static bqq<chn> a() {
      return buc.a(
         (Function<buc.b<chn>, ? extends App<buc.c<chn>, buf<chn>>>)($$0 -> $$0.group($$0.b(bya.d), $$0.a(bya.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ik $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dh(), 2.0) && !$$4.gv()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gw().b() != chq.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> kh.z.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gw().a($$2xx));
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
