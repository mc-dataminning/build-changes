import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emu extends ems {
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bro.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bro.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, emu::new)
   );
   private final bro c;
   private final bro d;

   public static emu a(bro $$0, bro $$1) {
      return new emu($$0, $$1);
   }

   public static emu a(bro $$0) {
      return new emu(brl.a(0), $$0);
   }

   public static emu b(bro $$0) {
      return new emu($$0, brl.a(0));
   }

   private emu(bro $$0, bro $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ji> a_(emq $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ji($$3, $$4, $$5));
   }

   @Override
   public emt<?> b() {
      return emt.n;
   }
}
