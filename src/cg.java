import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dix> d) {
   public static final cg a = a(dix.values());
   public static final cg b = a(dix.a, dix.c);
   public static final Codec<cg> c = dix.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dix... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dix $$0) {
      return this.d.contains($$0);
   }

   public List<dix> a() {
      return this.d;
   }
}
