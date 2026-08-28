import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ejr implements eiy {
   public static final Codec<ejr> a = ayi.c(enn.c).fieldOf("features").xmap(ejr::new, $$0 -> $$0.b).codec();
   public final jv<enn> b;

   public ejr(jv<enn> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<egg<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
