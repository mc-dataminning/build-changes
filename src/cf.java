import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dfj> d) {
   public static final cf a = a(dfj.values());
   public static final cf b = a(dfj.a, dfj.c);
   public static final Codec<cf> c = dfj.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dfj... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dfj $$0) {
      return this.d.contains($$0);
   }

   public List<dfj> a() {
      return this.d;
   }
}
