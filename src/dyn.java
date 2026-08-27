import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyn implements dxu {
   public static final Codec<dyn> a = awe.b(ecg.c).fieldOf("features").xmap(dyn::new, $$0 -> $$0.b).codec();
   public final ip<ecg> b;

   public dyn(ip<ecg> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dvd<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
