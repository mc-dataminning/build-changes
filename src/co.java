import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jn<cvz> c) implements dt<cwb> {
   public static final Codec<co> a = jy.a(lr.ac).xmap(co::new, co::b);

   @Override
   public km<cwb> a() {
      return kn.G;
   }

   public boolean a(cua $$0, cwb $$1) {
      Optional<jj<cvz>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jn<cvz> $$0) {
      return new co($$0);
   }

   public jn<cvz> b() {
      return this.c;
   }
}
