import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<des> d) {
   public static final ce a = a(des.values());
   public static final ce b = a(des.a, des.c);
   public static final Codec<ce> c = des.f.listOf().xmap(ce::new, ce::a);

   public static ce a(des... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(des $$0) {
      return this.d.contains($$0);
   }

   public List<des> a() {
      return this.d;
   }
}
