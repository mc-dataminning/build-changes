import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eis extends eja {
   public static final Codec<eis> a = RecordCodecBuilder.create($$0 -> $$0.group(ehz.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eis::new));
   private final ehz c;

   private eis(ehz $$0) {
      this.c = $$0;
   }

   public static eis a(ehz $$0) {
      return new eis($$0);
   }

   public static eis a(dzo $$0, dzo $$1) {
      return a(eic.a($$0, $$1));
   }

   public static eis b(dzo $$0, dzo $$1) {
      return a(eib.a($$0, $$1));
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ejb<?> b() {
      return ejb.l;
   }
}
