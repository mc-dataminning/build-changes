import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dis> d) {
   public static final cg a = a(dis.values());
   public static final cg b = a(dis.a, dis.c);
   public static final Codec<cg> c = dis.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dis... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dis $$0) {
      return this.d.contains($$0);
   }

   public List<dis> a() {
      return this.d;
   }
}
