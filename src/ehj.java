import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehj extends ehq {
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxt.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ehj::new)
   );
   private final dxt.a c;

   private ehj(dxt.a $$0) {
      this.c = $$0;
   }

   public static ehj a(dxt.a $$0) {
      return new ehj($$0);
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ehr<?> b() {
      return ehr.k;
   }
}
