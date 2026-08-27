import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class edo extends ebe {
   public static final Codec<edo> d = a(edo::new);

   public edo(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ij<cwm> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aty.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dqo.a.c, $$1x -> a($$1x, $$0));
   }

   private static ebi a(cuu $$0, drn $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ie $$4 = ie.c.a.a($$1);
      return new edn.h($$1, $$2, $$3, $$4);
   }

   private static void a(ebw $$0, ebe.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ebt a(cuu $$0, long $$1, ebt $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         drn $$3 = new drn(new dqp(drd.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ebi $$4 = $$2.c().get(0);
         eaw $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ie $$8 = ie.c.a.a($$3);
         ie $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ebi $$10 = new edn.h($$3, $$6, $$7, $$9);
         ebw $$11 = new ebw();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ebn<?> e() {
      return ebn.j;
   }
}
