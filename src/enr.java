import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class enr extends elg {
   public static final MapCodec<enr> d = a(enr::new);

   public enr(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jo<dfk> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awu.X)) {
            return Optional.empty();
         }
      }

      return a($$0, eao.a.c, $$1x -> a($$1x, $$0));
   }

   private static elk a(ddp $$0, ebn $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jk $$4 = jk.c.a.a($$1);
      return new enq.h($$1, $$2, $$3, $$4);
   }

   private static void a(ely $$0, elg.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static elv a(ddp $$0, long $$1, elv $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ebn $$3 = new ebn(new eap(ebd.a()));
         $$3.c($$1, $$0.e, $$0.f);
         elk $$4 = $$2.c().get(0);
         eky $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jk $$8 = jk.c.a.a($$3);
         jk $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         elk $$10 = new enq.h($$3, $$6, $$7, $$9);
         ely $$11 = new ely();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public elp<?> e() {
      return elp.j;
   }
}
