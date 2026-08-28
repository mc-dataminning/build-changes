import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enb extends enj {
   public static final MapCodec<enb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(emj.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, enb::new));
   private final emj c;

   private enb(emj $$0) {
      this.c = $$0;
   }

   public static enb a(emj $$0) {
      return new enb($$0);
   }

   public static enb a(eec $$0, eec $$1) {
      return a(emm.a($$0, $$1));
   }

   public static enb b(eec $$0, eec $$1) {
      return a(eml.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(enh $$0, bam $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public enk<?> b() {
      return enk.l;
   }
}
