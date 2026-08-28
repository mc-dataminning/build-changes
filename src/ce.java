import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<ded> d) {
   public static final ce a = a(ded.values());
   public static final ce b = a(ded.a, ded.c);
   public static final Codec<ce> c = ded.f.listOf().xmap(ce::new, ce::a);

   public static ce a(ded... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(ded $$0) {
      return this.d.contains($$0);
   }

   public List<ded> a() {
      return this.d;
   }
}
