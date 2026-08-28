import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwo> c) implements ds<cwq> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cwq> a() {
      return km.G;
   }

   public boolean a(cup $$0, cwq $$1) {
      Optional<ji<cwo>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwo> $$0) {
      return new co($$0);
   }

   public jm<cwo> b() {
      return this.c;
   }
}
