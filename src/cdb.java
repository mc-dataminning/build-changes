import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdb {
   private static final int a = 36;

   public static bzx<byf> a() {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$0 -> $$0.group($$0.a(chh.y), $$0.a(chh.z), $$0.a(chh.B))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<byf>a($$2).filter($$1xx -> $$1xx.g($$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.ec().a($$4.af(), $$4.ae());
                     }

                     return true;
                  }))
      );
   }
}
