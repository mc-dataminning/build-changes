import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emw extends emu {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brq.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brq.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, emw::new)
   );
   private final brq c;
   private final brq d;

   public static emw a(brq $$0, brq $$1) {
      return new emw($$0, $$1);
   }

   public static emw a(brq $$0) {
      return new emw(brn.a(0), $$0);
   }

   public static emw b(brq $$0) {
      return new emw($$0, brn.a(0));
   }

   private emw(brq $$0, brq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ji($$3, $$4, $$5));
   }

   @Override
   public emv<?> b() {
      return emv.n;
   }
}
