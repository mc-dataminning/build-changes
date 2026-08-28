import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dgg> d) {
   public static final cg a = a(dgg.values());
   public static final cg b = a(dgg.a, dgg.c);
   public static final Codec<cg> c = dgg.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dgg... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dgg $$0) {
      return this.d.contains($$0);
   }

   public List<dgg> a() {
      return this.d;
   }
}
