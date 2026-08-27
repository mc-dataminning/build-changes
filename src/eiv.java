import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eiv extends egp {
   public static final boa<dbo.c> d = boa.a(
      new dbo.c(brn.i, 10, 2, 3), new dbo.c(brn.bw, 5, 4, 4), new dbo.c(brn.bp, 8, 5, 5), new dbo.c(brn.aM, 2, 5, 5), new dbo.c(brn.ao, 3, 4, 4)
   );
   public static final Codec<eiv> e = a(eiv::new);

   public eiv(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      czk $$1 = $$0.h();
      in $$2 = new in($$1.d(), 64, $$1.e());
      return Optional.of(new egp.b($$2, (Consumer<ehh>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ehh $$0, egp.a $$1) {
      eiu.q $$2 = new eiu.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<egt> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         egt $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public egy<?> e() {
      return egy.d;
   }
}
