import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dgw> d) {
   public static final cg a = a(dgw.values());
   public static final cg b = a(dgw.a, dgw.c);
   public static final Codec<cg> c = dgw.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dgw... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dgw $$0) {
      return this.d.contains($$0);
   }

   public List<dgw> a() {
      return this.d;
   }
}
