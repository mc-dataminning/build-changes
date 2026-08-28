import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enm extends enk {
   public static final MapCodec<enm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsf.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bsf.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, enm::new)
   );
   private final bsf c;
   private final bsf d;

   public static enm a(bsf $$0, bsf $$1) {
      return new enm($$0, $$1);
   }

   public static enm a(bsf $$0) {
      return new enm(bsc.a(0), $$0);
   }

   public static enm b(bsf $$0) {
      return new enm($$0, bsc.a(0));
   }

   private enm(bsf $$0, bsf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(eni $$0, bac $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public enl<?> b() {
      return enl.n;
   }
}
