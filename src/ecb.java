import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecb extends ecj {
   public static final Codec<ecb> a = RecordCodecBuilder.create($$0 -> $$0.group(ebj.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecb::new));
   private final ebj c;

   private ecb(ebj $$0) {
      this.c = $$0;
   }

   public static ecb a(ebj $$0) {
      return new ecb($$0);
   }

   public static ecb a(dtg $$0, dtg $$1) {
      return a(ebm.a($$0, $$1));
   }

   public static ecb b(dtg $$0, dtg $$1) {
      return a(ebl.a($$0, $$1));
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eck<?> b() {
      return eck.l;
   }
}
