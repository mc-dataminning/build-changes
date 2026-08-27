import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eeg extends eeo {
   public static final Codec<eeg> a = RecordCodecBuilder.create($$0 -> $$0.group(edo.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eeg::new));
   private final edo c;

   private eeg(edo $$0) {
      this.c = $$0;
   }

   public static eeg a(edo $$0) {
      return new eeg($$0);
   }

   public static eeg a(dvl $$0, dvl $$1) {
      return a(edr.a($$0, $$1));
   }

   public static eeg b(dvl $$0, dvl $$1) {
      return a(edq.a($$0, $$1));
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eep<?> b() {
      return eep.l;
   }
}
