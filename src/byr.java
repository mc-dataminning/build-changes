import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class byr {
   public static byw<cqo> a() {
      return cci.a(
         (Function<cci.b<cqo>, ? extends App<cci.c<cqo>, ccl<cqo>>>)($$0 -> $$0.group($$0.b(cgg.d), $$0.a(cgg.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jd $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dt(), 2.0) && !$$4.gB()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if (!$$4.gz().b().a(cqr.b)) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.A().c($$6.b()))
                                 .flatMap($$0xxx -> mf.x.c().filter($$1xx -> ((cqr)$$1xx.a()).b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gz().b($$2xx));
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
