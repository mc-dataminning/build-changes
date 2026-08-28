import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ci(List<dkg> d) {
   public static final ci a = a(dkg.values());
   public static final ci b = a(dkg.a, dkg.c);
   public static final Codec<ci> c = dkg.f.listOf().xmap(ci::new, ci::a);

   public static ci a(dkg... $$0) {
      return new ci(Arrays.stream($$0).toList());
   }

   public boolean a(dkg $$0) {
      return this.d.contains($$0);
   }

   public List<dkg> a() {
      return this.d;
   }
}
