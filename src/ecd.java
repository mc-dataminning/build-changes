import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecd extends ecl {
   public static final Codec<ecd> a = RecordCodecBuilder.create($$0 -> $$0.group(ebl.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecd::new));
   private final ebl c;

   private ecd(ebl $$0) {
      this.c = $$0;
   }

   public static ecd a(ebl $$0) {
      return new ecd($$0);
   }

   public static ecd a(dti $$0, dti $$1) {
      return a(ebo.a($$0, $$1));
   }

   public static ecd b(dti $$0, dti $$1) {
      return a(ebn.a($$0, $$1));
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ecm<?> b() {
      return ecm.l;
   }
}
