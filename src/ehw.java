import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ehw extends efq {
   public static final bmt<dar.c> d = bmt.a(
      new dar.c(bqg.i, 10, 2, 3), new dar.c(bqg.bw, 5, 4, 4), new dar.c(bqg.bp, 8, 5, 5), new dar.c(bqg.aM, 2, 5, 5), new dar.c(bqg.ao, 3, 4, 4)
   );
   public static final Codec<ehw> e = a(ehw::new);

   public ehw(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      cyn $$1 = $$0.h();
      id $$2 = new id($$1.d(), 64, $$1.e());
      return Optional.of(new efq.b($$2, (Consumer<egi>)($$1x -> a($$1x, $$0))));
   }

   private static void a(egi $$0, efq.a $$1) {
      ehv.q $$2 = new ehv.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<efu> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         efu $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public efz<?> e() {
      return efz.d;
   }
}
