import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eak extends eas {
   public static final Codec<eak> a = RecordCodecBuilder.create($$0 -> $$0.group(dzs.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eak::new));
   private final dzs c;

   private eak(dzs $$0) {
      this.c = $$0;
   }

   public static eak a(dzs $$0) {
      return new eak($$0);
   }

   public static eak a(drp $$0, drp $$1) {
      return a(dzv.a($$0, $$1));
   }

   public static eak b(drp $$0, drp $$1) {
      return a(dzu.a($$0, $$1));
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eat<?> b() {
      return eat.l;
   }
}
