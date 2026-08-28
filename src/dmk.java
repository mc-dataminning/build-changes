import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dmk extends dvj implements dmd {
   public static final MapCodec<dmk> a = b(dmk::new);
   private static final ffc b = dma.a(16.0, 12.0, 16.0);

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return true;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return this.a($$0, $$2, $$3).isPresent();
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.a((div)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }

   private Optional<iu> a(div $$0, iu $$1, dzz $$2) {
      for (ja $$3 : ja.c.a.c($$0.A)) {
         iu $$4 = $$1.a($$3);
         if ($$0.v($$4) && this.m().a((diy)$$0, $$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }
}
