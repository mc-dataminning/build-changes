import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dhm> d) {
   public static final cg a = a(dhm.values());
   public static final cg b = a(dhm.a, dhm.c);
   public static final Codec<cg> c = dhm.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dhm... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dhm $$0) {
      return this.d.contains($$0);
   }

   public List<dhm> a() {
      return this.d;
   }
}
