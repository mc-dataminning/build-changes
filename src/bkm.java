import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bkm {
   public static bkr<cba> a() {
      return boc.a(
         (Function<boc.b<cba>, ? extends App<boc.c<cba>, bof<cba>>>)($$0 -> $$0.group($$0.b(bsa.d), $$0.a(bsa.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        hd $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.di(), 2.0) && !$$4.gj()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gk().b() != cbd.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.n();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.w().c($$6.b()))
                                 .flatMap($$0xxx -> jb.A.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
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
