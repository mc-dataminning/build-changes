import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyp implements dxw {
   public static final Codec<dyp> a = awe.b(eci.c).fieldOf("features").xmap(dyp::new, $$0 -> $$0.b).codec();
   public final ip<eci> b;

   public dyp(ip<eci> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dvf<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
