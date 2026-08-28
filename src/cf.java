import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dhe> d) {
   public static final cf a = a(dhe.values());
   public static final cf b = a(dhe.a, dhe.c);
   public static final Codec<cf> c = dhe.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dhe... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dhe $$0) {
      return this.d.contains($$0);
   }

   public List<dhe> a() {
      return this.d;
   }
}
