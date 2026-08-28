import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jn<cwb> c) implements dt<cwd> {
   public static final Codec<co> a = jy.a(lr.ac).xmap(co::new, co::b);

   @Override
   public km<cwd> a() {
      return kn.G;
   }

   public boolean a(cuc $$0, cwd $$1) {
      Optional<jj<cwb>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jn<cwb> $$0) {
      return new co($$0);
   }

   public jn<cwb> b() {
      return this.c;
   }
}
