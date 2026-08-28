import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehp extends ehx {
   public static final MapCodec<ehp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egx.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehp::new));
   private final egx c;

   private ehp(egx $$0) {
      this.c = $$0;
   }

   public static ehp a(egx $$0) {
      return new ehp($$0);
   }

   public static ehp a(dyt $$0, dyt $$1) {
      return a(eha.a($$0, $$1));
   }

   public static ehp b(dyt $$0, dyt $$1) {
      return a(egz.a($$0, $$1));
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehy<?> b() {
      return ehy.l;
   }
}
