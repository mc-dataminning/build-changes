import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dzf extends dwv {
   public static final Codec<dzf> d = a(dzf::new);

   public dzf(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ib<csq> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(arb.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dmf.a.c, $$1x -> a($$1x, $$0));
   }

   private static dwz a(cqz $$0, dne $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hx $$4 = hx.c.a.a($$1);
      return new dze.h($$1, $$2, $$3, $$4);
   }

   private static void a(dxn $$0, dwv.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dxk a(cqz $$0, long $$1, dxk $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dne $$3 = new dne(new dmg(dmu.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dwz $$4 = $$2.c().get(0);
         dwn $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hx $$8 = hx.c.a.a($$3);
         hx $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dwz $$10 = new dze.h($$3, $$6, $$7, $$9);
         dxn $$11 = new dxn();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dxe<?> e() {
      return dxe.j;
   }
}
