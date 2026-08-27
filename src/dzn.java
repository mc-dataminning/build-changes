import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzn extends dxh {
   public static final bhl<ctk.c> d = bhl.a(
      new ctk.c(bku.i, 10, 2, 3), new ctk.c(bku.bs, 5, 4, 4), new ctk.c(bku.bl, 8, 5, 5), new ctk.c(bku.aJ, 2, 5, 5), new ctk.c(bku.al, 3, 4, 4)
   );
   public static final Codec<dzn> e = a(dzn::new);

   public dzn(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      crh $$1 = $$0.h();
      ht $$2 = new ht($$1.d(), 64, $$1.e());
      return Optional.of(new dxh.b($$2, (Consumer<dxz>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dxz $$0, dxh.a $$1) {
      dzm.q $$2 = new dzm.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dxl> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dxl $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dxq<?> e() {
      return dxq.d;
   }
}
