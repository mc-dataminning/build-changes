import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dgd> d) {
   public static final cg a = a(dgd.values());
   public static final cg b = a(dgd.a, dgd.c);
   public static final Codec<cg> c = dgd.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dgd... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dgd $$0) {
      return this.d.contains($$0);
   }

   public List<dgd> a() {
      return this.d;
   }
}
