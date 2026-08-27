import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ejt extends ehj {
   public static final MapCodec<ejt> d = a(ejt::new);

   public ejt(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ix<dbw> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avv.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dwt.a.c, $$1x -> a($$1x, $$0));
   }

   private static ehn a(dae $$0, dxs $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      it $$4 = it.c.a.a($$1);
      return new ejs.h($$1, $$2, $$3, $$4);
   }

   private static void a(eib $$0, ehj.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ehy a(dae $$0, long $$1, ehy $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dxs $$3 = new dxs(new dwu(dxi.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ehn $$4 = $$2.c().get(0);
         ehb $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         it $$8 = it.c.a.a($$3);
         it $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ehn $$10 = new ejs.h($$3, $$6, $$7, $$9);
         eib $$11 = new eib();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ehs<?> e() {
      return ehs.j;
   }
}
