import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ehm implements egt {
   public static final Codec<ehm> a = ayw.b(elf.c).fieldOf("features").xmap(ehm::new, $$0 -> $$0.b).codec();
   public final ju<elf> b;

   public ehm(ju<elf> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eeb<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
