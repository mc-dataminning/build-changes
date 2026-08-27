import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bko {
   public static bkt<cbc> a() {
      return boe.a(
         (Function<boe.b<cbc>, ? extends App<boe.c<cbc>, boh<cbc>>>)($$0 -> $$0.group($$0.b(bsc.d), $$0.a(bsc.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hf $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.di(), 2.0) && !$$4.gk()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gl().b() != cbf.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.n();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.w().c($$6.b()))
                                 .flatMap($$0xxx -> jd.A.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gl().a($$2xx));
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
