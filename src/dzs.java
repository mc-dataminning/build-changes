import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzs extends dxm {
   public static final bhp<ctp.c> d = bhp.a(
      new ctp.c(bkz.i, 10, 2, 3), new ctp.c(bkz.bs, 5, 4, 4), new ctp.c(bkz.bl, 8, 5, 5), new ctp.c(bkz.aJ, 2, 5, 5), new ctp.c(bkz.al, 3, 4, 4)
   );
   public static final Codec<dzs> e = a(dzs::new);

   public dzs(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      crm $$1 = $$0.h();
      hx $$2 = new hx($$1.d(), 64, $$1.e());
      return Optional.of(new dxm.b($$2, (Consumer<dye>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dye $$0, dxm.a $$1) {
      dzr.q $$2 = new dzr.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dxq> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dxq $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dxv<?> e() {
      return dxv.d;
   }
}
