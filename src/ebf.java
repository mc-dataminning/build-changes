import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebf extends ebn {
   public static final Codec<ebf> a = RecordCodecBuilder.create($$0 -> $$0.group(ean.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ebf::new));
   private final ean c;

   private ebf(ean $$0) {
      this.c = $$0;
   }

   public static ebf a(ean $$0) {
      return new ebf($$0);
   }

   public static ebf a(dsk $$0, dsk $$1) {
      return a(eaq.a($$0, $$1));
   }

   public static ebf b(dsk $$0, dsk $$1) {
      return a(eap.a($$0, $$1));
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ebo<?> b() {
      return ebo.l;
   }
}
