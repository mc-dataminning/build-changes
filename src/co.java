import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwq> c) implements ds<cws> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cws> a() {
      return km.G;
   }

   public boolean a(cur $$0, cws $$1) {
      Optional<ji<cwq>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwq> $$0) {
      return new co($$0);
   }

   public jm<cwq> b() {
      return this.c;
   }
}
