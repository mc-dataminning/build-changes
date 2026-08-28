import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bur {
   public static buw<cly> a() {
      return byi.a(
         (Function<byi.b<cly>, ? extends App<byi.c<cly>, byl<cly>>>)($$0 -> $$0.group($$0.b(ccg.d), $$0.a(ccg.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ji $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dp(), 2.0) && !$$4.gx()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gy().b() != cmb.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> lq.x.t().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gy().a($$2xx));
                                    $$4.b($$3);
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }
}
