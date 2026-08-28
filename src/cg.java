import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dgf> d) {
   public static final cg a = a(dgf.values());
   public static final cg b = a(dgf.a, dgf.c);
   public static final Codec<cg> c = dgf.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dgf... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dgf $$0) {
      return this.d.contains($$0);
   }

   public List<dgf> a() {
      return this.d;
   }
}
