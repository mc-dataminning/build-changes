import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emv extends eko {
   public static final bpy<dff.c> d = bpy.a(
      new dff.c(btq.i, 10, 2, 3), new dff.c(btq.bx, 5, 4, 4), new dff.c(btq.bq, 8, 5, 5), new dff.c(btq.aN, 2, 5, 5), new dff.c(btq.ap, 3, 4, 4)
   );
   public static final MapCodec<emv> e = a(emv::new);

   public emv(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      dcy $$1 = $$0.h();
      je $$2 = new je($$1.d(), 64, $$1.e());
      return Optional.of(new eko.b($$2, (Consumer<elg>)($$1x -> a($$1x, $$0))));
   }

   private static void a(elg $$0, eko.a $$1) {
      emu.q $$2 = new emu.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eks> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eks $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ekx<?> e() {
      return ekx.d;
   }
}
