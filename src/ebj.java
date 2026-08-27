import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class ebj extends dyz {
   public static final Codec<ebj> d = a(ebj::new);

   public ebj(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ih<cuh> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(asa.X)) {
            return Optional.empty();
         }
      }

      return a($$0, doj.a.c, $$1x -> a($$1x, $$0));
   }

   private static dzd a(csp $$0, dpi $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ic $$4 = ic.c.a.a($$1);
      return new ebi.h($$1, $$2, $$3, $$4);
   }

   private static void a(dzr $$0, dyz.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dzo a(csp $$0, long $$1, dzo $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dpi $$3 = new dpi(new dok(doy.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dzd $$4 = $$2.c().get(0);
         dyr $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ic $$8 = ic.c.a.a($$3);
         ic $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dzd $$10 = new ebi.h($$3, $$6, $$7, $$9);
         dzr $$11 = new dzr();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dzi<?> e() {
      return dzi.j;
   }
}
