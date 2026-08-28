import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class egr implements efy {
   public static final Codec<egr> a = ayo.b(ekk.c).fieldOf("features").xmap(egr::new, $$0 -> $$0.b).codec();
   public final js<ekk> b;

   public egr(js<ekk> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<edg<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
