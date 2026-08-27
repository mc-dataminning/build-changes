import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class blw {
   public static bmb<cck> a() {
      return bpm.a(
         (Function<bpm.b<cck>, ? extends App<bpm.c<cck>, bpp<cck>>>)($$0 -> $$0.group($$0.b(btk.d), $$0.a(btk.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        ia $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dj(), 2.0) && !$$4.go()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gp().b() != ccn.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.n();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.w().c($$6.b()))
                                 .flatMap($$0xxx -> jy.A.s().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
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
