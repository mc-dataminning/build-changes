import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehe extends ehm {
   public static final MapCodec<ehe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egm.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehe::new));
   private final egm c;

   private ehe(egm $$0) {
      this.c = $$0;
   }

   public static ehe a(egm $$0) {
      return new ehe($$0);
   }

   public static ehe a(dyj $$0, dyj $$1) {
      return a(egp.a($$0, $$1));
   }

   public static ehe b(dyj $$0, dyj $$1) {
      return a(ego.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehn<?> b() {
      return ehn.l;
   }
}
