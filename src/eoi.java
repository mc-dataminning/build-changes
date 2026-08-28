import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eoi extends emb {
   public static final bqt<dgt.c> d = bqt.a(
      new dgt.c(bup.i, 10, 2, 3), new dgt.c(bup.bx, 5, 4, 4), new dgt.c(bup.bq, 8, 5, 5), new dgt.c(bup.aN, 2, 5, 5), new dgt.c(bup.ap, 3, 4, 4)
   );
   public static final MapCodec<eoi> e = a(eoi::new);

   public eoi(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      del $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new emb.b($$2, (Consumer<emt>)($$1x -> a($$1x, $$0))));
   }

   private static void a(emt $$0, emb.a $$1) {
      eoh.q $$2 = new eoh.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<emf> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         emf $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public emk<?> e() {
      return emk.d;
   }
}
