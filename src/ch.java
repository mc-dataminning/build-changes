import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ch(List<djj> d) {
   public static final ch a = a(djj.values());
   public static final ch b = a(djj.a, djj.c);
   public static final Codec<ch> c = djj.f.listOf().xmap(ch::new, ch::a);

   public static ch a(djj... $$0) {
      return new ch(Arrays.stream($$0).toList());
   }

   public boolean a(djj $$0) {
      return this.d.contains($$0);
   }

   public List<djj> a() {
      return this.d;
   }
}
