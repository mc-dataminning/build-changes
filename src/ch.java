import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ch(List<dje> d) {
   public static final ch a = a(dje.values());
   public static final ch b = a(dje.a, dje.c);
   public static final Codec<ch> c = dje.f.listOf().xmap(ch::new, ch::a);

   public static ch a(dje... $$0) {
      return new ch(Arrays.stream($$0).toList());
   }

   public boolean a(dje $$0) {
      return this.d.contains($$0);
   }

   public List<dje> a() {
      return this.d;
   }
}
