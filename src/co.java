import com.mojang.serialization.Codec;
import java.util.Optional;

public record co(jn<cwc> c) implements dt<cwe> {
   public static final Codec<co> a = jy.a(lr.ac).xmap(co::new, co::b);

   @Override
   public km<cwe> a() {
      return kn.G;
   }

   public boolean a(cud $$0, cwe $$1) {
      Optional<jj<cwc>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cq a(jn<cwc> $$0) {
      return new co($$0);
   }

   public jn<cwc> b() {
      return this.c;
   }
}
