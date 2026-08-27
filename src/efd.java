import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efd implements eek {
   public static final Codec<efd> a = axu.b(eix.c).fieldOf("features").xmap(efd::new, $$0 -> $$0.b).codec();
   public final je<eix> b;

   public efd(je<eix> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ebm<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
