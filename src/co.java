import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jm<cwj> c) implements ds<cwl> {
   public static final Codec<co> a = jx.a(lq.Y).xmap(co::new, co::b);

   @Override
   public kl<cwl> a() {
      return km.F;
   }

   public boolean a(cuk $$0, cwl $$1) {
      Optional<ji<cwj>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jm<cwj> $$0) {
      return new co($$0);
   }

   public jm<cwj> b() {
      return this.c;
   }
}
