import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehk extends ehs {
   public static final MapCodec<ehk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egs.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehk::new));
   private final egs c;

   private ehk(egs $$0) {
      this.c = $$0;
   }

   public static ehk a(egs $$0) {
      return new ehk($$0);
   }

   public static ehk a(dyp $$0, dyp $$1) {
      return a(egv.a($$0, $$1));
   }

   public static ehk b(dyp $$0, dyp $$1) {
      return a(egu.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eht<?> b() {
      return eht.l;
   }
}
