import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class edv extends ebl {
   public static final Codec<edv> d = a(edv::new);

   public edv(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ij<cwq> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(atz.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dqv.a.c, $$1x -> a($$1x, $$0));
   }

   private static ebp a(cuy $$0, dru $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ie $$4 = ie.c.a.a($$1);
      return new edu.h($$1, $$2, $$3, $$4);
   }

   private static void a(ecd $$0, ebl.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eca a(cuy $$0, long $$1, eca $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dru $$3 = new dru(new dqw(drk.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ebp $$4 = $$2.c().get(0);
         ebd $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ie $$8 = ie.c.a.a($$3);
         ie $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ebp $$10 = new edu.h($$3, $$6, $$7, $$9);
         ecd $$11 = new ecd();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ebu<?> e() {
      return ebu.j;
   }
}
