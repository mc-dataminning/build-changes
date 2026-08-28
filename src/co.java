import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwm> c) implements ds<cwo> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cwo> a() {
      return km.F;
   }

   public boolean a(cun $$0, cwo $$1) {
      Optional<ji<cwm>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwm> $$0) {
      return new co($$0);
   }

   public jm<cwm> b() {
      return this.c;
   }
}
