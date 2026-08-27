import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eff extends efn {
   public static final Codec<eff> a = RecordCodecBuilder.create($$0 -> $$0.group(een.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eff::new));
   private final een c;

   private eff(een $$0) {
      this.c = $$0;
   }

   public static eff a(een $$0) {
      return new eff($$0);
   }

   public static eff a(dwk $$0, dwk $$1) {
      return a(eeq.a($$0, $$1));
   }

   public static eff b(dwk $$0, dwk $$1) {
      return a(eep.a($$0, $$1));
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public efo<?> b() {
      return efo.l;
   }
}
