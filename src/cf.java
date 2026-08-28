import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dhf> d) {
   public static final cf a = a(dhf.values());
   public static final cf b = a(dhf.a, dhf.c);
   public static final Codec<cf> c = dhf.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dhf... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dhf $$0) {
      return this.d.contains($$0);
   }

   public List<dhf> a() {
      return this.d;
   }
}
