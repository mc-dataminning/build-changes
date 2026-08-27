import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dyd extends dwa {
   public static final Codec<dyd> d = a(dyd::new);

   public dyd(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ib<crx> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aqr.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dlk.a.c, $$1x -> a($$1x, $$0));
   }

   private static dwe a(cqg $$0, dmj $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hx $$4 = hx.c.a.a($$1);
      return new dyc.h($$1, $$2, $$3, $$4);
   }

   private static void a(dws $$0, dwa.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dwp a(cqg $$0, long $$1, dwp $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dmj $$3 = new dmj(new dll(dlz.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dwe $$4 = $$2.c().get(0);
         dvs $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hx $$8 = hx.c.a.a($$3);
         hx $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dwe $$10 = new dyc.h($$3, $$6, $$7, $$9);
         dws $$11 = new dws();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dwj<?> e() {
      return dwj.j;
   }
}
