import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eay extends dyo {
   public static final Codec<eay> d = a(eay::new);

   public eay(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ie<ctx> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(arq.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dny.a.c, $$1x -> a($$1x, $$0));
   }

   private static dys a(csf $$0, dox $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ia $$4 = ia.c.a.a($$1);
      return new eax.h($$1, $$2, $$3, $$4);
   }

   private static void a(dzg $$0, dyo.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dzd a(csf $$0, long $$1, dzd $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dox $$3 = new dox(new dnz(don.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dys $$4 = $$2.c().get(0);
         dyg $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ia $$8 = ia.c.a.a($$3);
         ia $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dys $$10 = new eax.h($$3, $$6, $$7, $$9);
         dzg $$11 = new dzg();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dyx<?> e() {
      return dyx.j;
   }
}
