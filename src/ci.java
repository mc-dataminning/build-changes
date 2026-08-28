import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ci(List<djw> d) {
   public static final ci a = a(djw.values());
   public static final ci b = a(djw.a, djw.c);
   public static final Codec<ci> c = djw.f.listOf().xmap(ci::new, ci::a);

   public static ci a(djw... $$0) {
      return new ci(Arrays.stream($$0).toList());
   }

   public boolean a(djw $$0) {
      return this.d.contains($$0);
   }

   public List<djw> a() {
      return this.d;
   }
}
