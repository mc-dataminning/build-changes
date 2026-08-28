import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ejt implements eja {
   public static final Codec<ejt> a = azn.b(eno.c).fieldOf("features").xmap(ejt::new, $$0 -> $$0.b).codec();
   public final ju<eno> b;

   public ejt(ju<eno> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<egi<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
