import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ejl implements eis {
   public static final Codec<ejl> a = azn.b(eng.c).fieldOf("features").xmap(ejl::new, $$0 -> $$0.b).codec();
   public final ju<eng> b;

   public ejl(ju<eng> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ega<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
