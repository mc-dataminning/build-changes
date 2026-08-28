import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehh extends ehp {
   public static final MapCodec<ehh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egp.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehh::new));
   private final egp c;

   private ehh(egp $$0) {
      this.c = $$0;
   }

   public static ehh a(egp $$0) {
      return new ehh($$0);
   }

   public static ehh a(dym $$0, dym $$1) {
      return a(egs.a($$0, $$1));
   }

   public static ehh b(dym $$0, dym $$1) {
      return a(egr.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehq<?> b() {
      return ehq.l;
   }
}
