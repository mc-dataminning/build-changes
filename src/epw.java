import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class epw extends enl {
   public static final MapCodec<epw> d = a(epw::new);

   public epw(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jr<dhj> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ecr.a.c, $$1x -> a($$1x, $$0));
   }

   private static enp a(dfn $$0, edq $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jn $$4 = jn.c.a.a($$1);
      return new epv.h($$1, $$2, $$3, $$4);
   }

   private static void a(eod $$0, enl.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eoa a(dfn $$0, long $$1, eoa $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         edq $$3 = new edq(new ecs(edg.a()));
         $$3.c($$1, $$0.h, $$0.i);
         enp $$4 = $$2.c().get(0);
         end $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jn $$8 = jn.c.a.a($$3);
         jn $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         enp $$10 = new epv.h($$3, $$6, $$7, $$9);
         eod $$11 = new eod();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public enu<?> e() {
      return enu.j;
   }
}
