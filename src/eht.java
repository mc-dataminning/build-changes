import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eht implements eha {
   public static final Codec<eht> a = ayv.b(elm.c).fieldOf("features").xmap(eht::new, $$0 -> $$0.b).codec();
   public final ju<elm> b;

   public eht(ju<elm> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eei<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
