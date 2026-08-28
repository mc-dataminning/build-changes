import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ch(List<dju> d) {
   public static final ch a = a(dju.values());
   public static final ch b = a(dju.a, dju.c);
   public static final Codec<ch> c = dju.f.listOf().xmap(ch::new, ch::a);

   public static ch a(dju... $$0) {
      return new ch(Arrays.stream($$0).toList());
   }

   public boolean a(dju $$0) {
      return this.d.contains($$0);
   }

   public List<dju> a() {
      return this.d;
   }
}
