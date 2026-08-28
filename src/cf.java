import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dey> d) {
   public static final cf a = a(dey.values());
   public static final cf b = a(dey.a, dey.c);
   public static final Codec<cf> c = dey.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dey... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dey $$0) {
      return this.d.contains($$0);
   }

   public List<dey> a() {
      return this.d;
   }
}
