import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eim extends egg {
   public static final bne<dbf.c> d = bne.a(
      new dbf.c(bqr.i, 10, 2, 3), new dbf.c(bqr.bw, 5, 4, 4), new dbf.c(bqr.bp, 8, 5, 5), new dbf.c(bqr.aM, 2, 5, 5), new dbf.c(bqr.ao, 3, 4, 4)
   );
   public static final Codec<eim> e = a(eim::new);

   public eim(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      czb $$1 = $$0.h();
      im $$2 = new im($$1.d(), 64, $$1.e());
      return Optional.of(new egg.b($$2, (Consumer<egy>)($$1x -> a($$1x, $$0))));
   }

   private static void a(egy $$0, egg.a $$1) {
      eil.q $$2 = new eil.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<egk> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         egk $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public egp<?> e() {
      return egp.d;
   }
}
