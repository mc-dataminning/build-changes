import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dge> d) {
   public static final cg a = a(dge.values());
   public static final cg b = a(dge.a, dge.c);
   public static final Codec<cg> c = dge.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dge... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dge $$0) {
      return this.d.contains($$0);
   }

   public List<dge> a() {
      return this.d;
   }
}
