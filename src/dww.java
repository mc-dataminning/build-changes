import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dww implements dwd {
   public static final Codec<dww> a = avq.b(eap.c).fieldOf("features").xmap(dww::new, $$0 -> $$0.b).codec();
   public final in<eap> b;

   public dww(in<eap> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dtm<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
