import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eom extends emb {
   public static final MapCodec<eom> d = a(eom::new);

   public eom(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dgh> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axc.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ebj.a.c, $$1x -> a($$1x, $$0));
   }

   private static emf a(del $$0, eci $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eol.h($$1, $$2, $$3, $$4);
   }

   private static void a(emt $$0, emb.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static emq a(del $$0, long $$1, emq $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eci $$3 = new eci(new ebk(eby.a()));
         $$3.c($$1, $$0.g, $$0.h);
         emf $$4 = $$2.c().get(0);
         elt $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         emf $$10 = new eol.h($$3, $$6, $$7, $$9);
         emt $$11 = new emt();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public emk<?> e() {
      return emk.j;
   }
}
