import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dxr implements dwy {
   public static final Codec<dxr> a = avu.b(ebk.c).fieldOf("features").xmap(dxr::new, $$0 -> $$0.b).codec();
   public final ip<ebk> b;

   public dxr(ip<ebk> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<duh<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
