import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class epv extends enk {
   public static final MapCodec<epv> d = a(epv::new);

   public epv(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jr<dhi> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awn.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ecq.a.c, $$1x -> a($$1x, $$0));
   }

   private static eno a(dfm $$0, edp $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jn $$4 = jn.c.a.a($$1);
      return new epu.h($$1, $$2, $$3, $$4);
   }

   private static void a(eoc $$0, enk.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static enz a(dfm $$0, long $$1, enz $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         edp $$3 = new edp(new ecr(edf.a()));
         $$3.c($$1, $$0.h, $$0.i);
         eno $$4 = $$2.c().get(0);
         enc $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jn $$8 = jn.c.a.a($$3);
         jn $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eno $$10 = new epu.h($$3, $$6, $$7, $$9);
         eoc $$11 = new eoc();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ent<?> e() {
      return ent.j;
   }
}
