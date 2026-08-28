import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehr extends ehp {
   public static final MapCodec<ehr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpx.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpx.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ehr::new)
   );
   private final bpx c;
   private final bpx d;

   public static ehr a(bpx $$0, bpx $$1) {
      return new ehr($$0, $$1);
   }

   public static ehr a(bpx $$0) {
      return new ehr(bpu.a(0), $$0);
   }

   public static ehr b(bpx $$0) {
      return new ehr($$0, bpu.a(0));
   }

   private ehr(bpx $$0, bpx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public ehq<?> b() {
      return ehq.n;
   }
}
