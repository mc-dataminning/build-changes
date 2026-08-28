import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record cf(List<dgx> d) {
   public static final cf a = a(dgx.values());
   public static final cf b = a(dgx.a, dgx.c);
   public static final Codec<cf> c = dgx.f.listOf().xmap(cf::new, cf::a);

   public static cf a(dgx... $$0) {
      return new cf(Arrays.stream($$0).toList());
   }

   public boolean a(dgx $$0) {
      return this.d.contains($$0);
   }

   public List<dgx> a() {
      return this.d;
   }
}
