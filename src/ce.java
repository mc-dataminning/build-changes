import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<deg> d) {
   public static final ce a = a(deg.values());
   public static final ce b = a(deg.a, deg.c);
   public static final Codec<ce> c = deg.f.listOf().xmap(ce::new, ce::a);

   public static ce a(deg... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(deg $$0) {
      return this.d.contains($$0);
   }

   public List<deg> a() {
      return this.d;
   }
}
