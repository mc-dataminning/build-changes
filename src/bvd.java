import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class bvd {
   public static bvi<cmk> a() {
      return byu.a(
         (Function<byu.b<cmk>, ? extends App<byu.c<cmk>, byx<cmk>>>)($$0 -> $$0.group($$0.b(ccs.d), $$0.a(ccs.c))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jl $$6 = $$0.b($$1);
                        if (!$$6.b().a($$4.dm(), 2.0) && !$$4.gu()) {
                           return false;
                        } else {
                           $$1.b();
                           $$2.a($$6);
                           $$3.a($$4, (byte)14);
                           if ($$4.gv().b() != cmn.b) {
                              return true;
                           } else {
                              MinecraftServer $$7 = $$3.o();
                              Optional.ofNullable($$7.a($$6.a()))
                                 .flatMap($$1xx -> $$1xx.y().c($$6.b()))
                                 .flatMap($$0xxx -> lt.x.t().filter($$1xx -> $$1xx.b().test($$0xxx)).findFirst())
                                 .ifPresent($$2xx -> {
                                    $$4.a($$4.gv().a($$2xx));
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
