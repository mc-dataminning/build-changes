import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dgw> d) {
   public static final cf a = a(dgw.values());
   public static final cf b = a(dgw.a, dgw.c);
   public static final Codec<cf> c = dgw.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dgw... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dgw $$0) {
      return this.d.contains($$0);
   }

   public List<dgw> a() {
      return this.d;
   }
}
