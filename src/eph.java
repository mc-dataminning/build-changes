import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eph extends epp {
   public static final MapCodec<eph> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eop.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eph::new));
   private final eop c;

   private eph(eop $$0) {
      this.c = $$0;
   }

   public static eph a(eop $$0) {
      return new eph($$0);
   }

   public static eph a(egh $$0, egh $$1) {
      return a(eos.a($$0, $$1));
   }

   public static eph b(egh $$0, egh $$1) {
      return a(eor.a($$0, $$1));
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public epq<?> b() {
      return epq.l;
   }
}
