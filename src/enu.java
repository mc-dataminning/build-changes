import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class enu implements enb {
   public static final Codec<enu> a = azg.c(err.c).fieldOf("features").xmap(enu::new, $$0 -> $$0.b).codec();
   public final jk<err> b;

   public enu(jk<err> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ekh<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
