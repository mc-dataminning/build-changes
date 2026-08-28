import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elg extends ele {
   public static final MapCodec<elg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bri.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bri.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, elg::new)
   );
   private final bri c;
   private final bri d;

   public static elg a(bri $$0, bri $$1) {
      return new elg($$0, $$1);
   }

   public static elg a(bri $$0) {
      return new elg(brf.a(0), $$0);
   }

   public static elg b(bri $$0) {
      return new elg($$0, brf.a(0));
   }

   private elg(bri $$0, bri $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(elc $$0, azs $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public elf<?> b() {
      return elf.n;
   }
}
