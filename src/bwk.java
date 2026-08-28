import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bwk {
   public static bwp<cnt> a() {
      return cab.a(
         (Function<cab.b<cnt>, ? extends App<cab.c<cnt>, cae<cnt>>>)($$0 -> $$0.group($$0.b(cdz.d), $$0.a(cdz.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jo $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dv(), 2.0) && !$$4.gG()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gF().b() != cnw.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> lx.x.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gF().a($$2xx));
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
