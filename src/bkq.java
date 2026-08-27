import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkq {
   public static bhs<bfz> a(cpn $$0) {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$1 -> $$1.group($$1.c(bpb.o), $$1.b(bpb.m), $$1.b(bpb.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aV() && $$3x.ay()) {
                        gu $$5 = $$3x.di().d();

                        for (ha $$6 : ha.c.a) {
                           gu $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ha.b).b() && $$2x.b_($$7).b(dxf.c)) {
                              gu $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dcb $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dgl.i, $$8, dgl.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, amh.iI, ami.e, 1.0F, 1.0F);
                                 $$3.b();
                                 return true;
                              }
                           }
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
