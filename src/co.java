import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwp> c) implements ds<cwr> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cwr> a() {
      return km.G;
   }

   public boolean a(cuq $$0, cwr $$1) {
      Optional<ji<cwp>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwp> $$0) {
      return new co($$0);
   }

   public jm<cwp> b() {
      return this.c;
   }
}
