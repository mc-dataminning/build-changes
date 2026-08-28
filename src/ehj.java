import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehj extends ehr {
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egr.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehj::new));
   private final egr c;

   private ehj(egr $$0) {
      this.c = $$0;
   }

   public static ehj a(egr $$0) {
      return new ehj($$0);
   }

   public static ehj a(dyo $$0, dyo $$1) {
      return a(egu.a($$0, $$1));
   }

   public static ehj b(dyo $$0, dyo $$1) {
      return a(egt.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehs<?> b() {
      return ehs.l;
   }
}
