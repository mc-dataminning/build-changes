import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cg(List<dim> d) {
   public static final cg a = a(dim.values());
   public static final cg b = a(dim.a, dim.c);
   public static final Codec<cg> c = dim.f.listOf().xmap(cg::new, cg::a);

   public static cg a(dim... $$0) {
      return new cg(Arrays.stream($$0).toList());
   }

   public boolean a(dim $$0) {
      return this.d.contains($$0);
   }

   public List<dim> a() {
      return this.d;
   }
}
