import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwn> c) implements ds<cwp> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cwp> a() {
      return km.G;
   }

   public boolean a(cuo $$0, cwp $$1) {
      Optional<ji<cwn>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwn> $$0) {
      return new co($$0);
   }

   public jm<cwn> b() {
      return this.c;
   }
}
