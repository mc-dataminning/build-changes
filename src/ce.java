import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<dct> d) {
   public static final ce a = a(dct.values());
   public static final ce b = a(dct.a, dct.c);
   public static final Codec<ce> c = dct.f.listOf().xmap(ce::new, ce::a);

   public static ce a(dct... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(dct $$0) {
      return this.d.contains($$0);
   }

   public List<dct> a() {
      return this.d;
   }
}
