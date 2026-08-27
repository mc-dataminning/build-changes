import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dsx implements dse {
   public static final Codec<dsx> a = asy.b(dwq.c).fieldOf("features").xmap(dsx::new, $$0 -> $$0.b).codec();
   public final ik<dwq> b;

   public dsx(ik<dwq> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dpn<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
