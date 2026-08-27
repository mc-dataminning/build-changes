import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ecu implements ecb {
   public static final Codec<ecu> a = axm.b(egn.c).fieldOf("features").xmap(ecu::new, $$0 -> $$0.b).codec();
   public final jb<egn> b;

   public ecu(jb<egn> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dzk<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
