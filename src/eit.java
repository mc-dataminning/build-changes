import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eit implements eia {
   public static final Codec<eit> a = ayh.c(emo.c).fieldOf("features").xmap(eit::new, $$0 -> $$0.b).codec();
   public final jv<emo> b;

   public eit(jv<emo> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<efi<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
