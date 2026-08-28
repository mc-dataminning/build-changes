import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eex implements eee {
   public static final Codec<eex> a = axv.b(eiq.c).fieldOf("features").xmap(eex::new, $$0 -> $$0.b).codec();
   public final jq<eiq> b;

   public eex(jq<eiq> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ebn<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
