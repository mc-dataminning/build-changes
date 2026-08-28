import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enc extends enk {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(emk.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, enc::new));
   private final emk c;

   private enc(emk $$0) {
      this.c = $$0;
   }

   public static enc a(emk $$0) {
      return new enc($$0);
   }

   public static enc a(eed $$0, eed $$1) {
      return a(emn.a($$0, $$1));
   }

   public static enc b(eed $$0, eed $$1) {
      return a(emm.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(eni $$0, bac $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public enl<?> b() {
      return enl.l;
   }
}
