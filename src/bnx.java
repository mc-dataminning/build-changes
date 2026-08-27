import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bnx {
   public static boc<ceu> a() {
      return bro.a(
         (Function<bro.b<ceu>, ? extends App<bro.c<ceu>, brr<ceu>>>)($$0 -> $$0.group($$0.b(bvm.d), $$0.a(bvm.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ig $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dk(), 2.0) && !$$4.go()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gp().b() != cex.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> kd.z.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gp().a($$2xx));
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
