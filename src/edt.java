import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edt implements eda {
   public static final Codec<edt> a = ayf.b(ehm.c).fieldOf("features").xmap(edt::new, $$0 -> $$0.b).codec();
   public final jm<ehm> b;

   public edt(jm<ehm> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eaj<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
