import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eho extends ehm {
   public static final MapCodec<eho> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpu.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpu.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eho::new)
   );
   private final bpu c;
   private final bpu d;

   public static eho a(bpu $$0, bpu $$1) {
      return new eho($$0, $$1);
   }

   public static eho a(bpu $$0) {
      return new eho(bpr.a(0), $$0);
   }

   public static eho b(bpu $$0) {
      return new eho($$0, bpr.a(0));
   }

   private eho(bpu $$0, bpu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public ehn<?> b() {
      return ehn.n;
   }
}
