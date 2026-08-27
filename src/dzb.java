import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzb extends dwv {
   public static final bhe<ctc.c> d = bhe.a(
      new ctc.c(bkm.i, 10, 2, 3), new ctc.c(bkm.bs, 5, 4, 4), new ctc.c(bkm.bl, 8, 5, 5), new ctc.c(bkm.aJ, 2, 5, 5), new ctc.c(bkm.al, 3, 4, 4)
   );
   public static final Codec<dzb> e = a(dzb::new);

   public dzb(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      cqz $$1 = $$0.h();
      ht $$2 = new ht($$1.d(), 64, $$1.e());
      return Optional.of(new dwv.b($$2, (Consumer<dxn>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dxn $$0, dwv.a $$1) {
      dza.q $$2 = new dza.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dwz> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dwz $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dxe<?> e() {
      return dxe.d;
   }
}
