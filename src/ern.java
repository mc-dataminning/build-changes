import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ern extends epg {
   public static final bsb<dje.c> d = bsb.<dje.c>b()
      .a(new dje.c(bwb.o, 2, 3), 10)
      .a(new dje.c(bwb.bQ, 4, 4), 5)
      .a(new dje.c(bwb.bJ, 5, 5), 8)
      .a(new dje.c(bwb.be, 5, 5), 2)
      .a(new dje.c(bwb.az, 4, 4), 3)
      .a();
   public static final MapCodec<ern> e = a(ern::new);

   public ern(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      dgw $$1 = $$0.h();
      jj $$2 = new jj($$1.d(), 64, $$1.e());
      return Optional.of(new epg.b($$2, (Consumer<epy>)($$1x -> a($$1x, $$0))));
   }

   private static void a(epy $$0, epg.a $$1) {
      erm.q $$2 = new erm.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<epk> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         epk $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public epp<?> e() {
      return epp.d;
   }
}
