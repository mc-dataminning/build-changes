import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehi extends ehq {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egq.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehi::new));
   private final egq c;

   private ehi(egq $$0) {
      this.c = $$0;
   }

   public static ehi a(egq $$0) {
      return new ehi($$0);
   }

   public static ehi a(dyn $$0, dyn $$1) {
      return a(egt.a($$0, $$1));
   }

   public static ehi b(dyn $$0, dyn $$1) {
      return a(egs.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehr<?> b() {
      return ehr.l;
   }
}
