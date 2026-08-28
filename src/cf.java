import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dfc> d) {
   public static final cf a = a(dfc.values());
   public static final cf b = a(dfc.a, dfc.c);
   public static final Codec<cf> c = dfc.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dfc... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dfc $$0) {
      return this.d.contains($$0);
   }

   public List<dfc> a() {
      return this.d;
   }
}
