import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erk extends eri {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btw.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), btw.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, erk::new)
   );
   private final btw c;
   private final btw d;

   public static erk a(btw $$0, btw $$1) {
      return new erk($$0, $$1);
   }

   public static erk a(btw $$0) {
      return new erk(btt.a(0), $$0);
   }

   public static erk b(btw $$0) {
      return new erk($$0, btt.a(0));
   }

   private erk(btw $$0, btw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iv($$3, $$4, $$5));
   }

   @Override
   public erj<?> b() {
      return erj.n;
   }
}
