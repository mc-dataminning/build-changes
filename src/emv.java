import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emv extends emt {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brp.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brp.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, emv::new)
   );
   private final brp c;
   private final brp d;

   public static emv a(brp $$0, brp $$1) {
      return new emv($$0, $$1);
   }

   public static emv a(brp $$0) {
      return new emv(brm.a(0), $$0);
   }

   public static emv b(brp $$0) {
      return new emv($$0, brm.a(0));
   }

   private emv(brp $$0, brp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ji($$3, $$4, $$5));
   }

   @Override
   public emu<?> b() {
      return emu.n;
   }
}
