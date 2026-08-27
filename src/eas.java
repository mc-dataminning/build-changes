import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eas implements dzz {
   public static final Codec<eas> a = aws.b(eel.c).fieldOf("features").xmap(eas::new, $$0 -> $$0.b).codec();
   public final ip<eel> b;

   public eas(ip<eel> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dxi<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
