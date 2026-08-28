import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class byw {
   public static bzb<cqy> a() {
      return ccn.a(
         (Function<ccn.b<cqy>, ? extends App<ccn.c<cqy>, ccq<cqy>>>)($$0 -> $$0.group($$0.b(cgl.d), $$0.a(cgl.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        je $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.ds(), 2.0) && !$$4.gD()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if (!$$4.gB().b().a(crb.b)) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.p();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.A().c($$6.b()))
                                 .flatMap($$0xxx -> mg.x.c().filter($$1xx -> ((crb)$$1xx.a()).b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gB().b($$2xx));
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
