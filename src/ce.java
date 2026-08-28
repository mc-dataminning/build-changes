import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ce(List<dcr> d) {
   public static final ce a = a(dcr.values());
   public static final ce b = a(dcr.a, dcr.c);
   public static final Codec<ce> c = dcr.f.listOf().xmap(ce::new, ce::a);

   public static ce a(dcr... $$0) {
      return new ce(Arrays.stream($$0).toList());
   }

   public boolean a(dcr $$0) {
      return this.d.contains($$0);
   }

   public List<dcr> a() {
      return this.d;
   }
}
