import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class efi extends edc {
   public static final blq<cyk.c> d = blq.a(
      new cyk.c(bpc.j, 10, 2, 3), new cyk.c(bpc.bw, 5, 4, 4), new cyk.c(bpc.bp, 8, 5, 5), new cyk.c(bpc.aM, 2, 5, 5), new cyk.c(bpc.ao, 3, 4, 4)
   );
   public static final Codec<efi> e = a(efi::new);

   public efi(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      cwg $$1 = $$0.h();
      ib $$2 = new ib($$1.d(), 64, $$1.e());
      return Optional.of(new edc.b($$2, (Consumer<edu>)($$1x -> a($$1x, $$0))));
   }

   private static void a(edu $$0, edc.a $$1) {
      efh.q $$2 = new efh.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<edg> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         edg $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public edl<?> e() {
      return edl.d;
   }
}
