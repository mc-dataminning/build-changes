import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehl extends eht {
   public static final MapCodec<ehl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(egt.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehl::new));
   private final egt c;

   private ehl(egt $$0) {
      this.c = $$0;
   }

   public static ehl a(egt $$0) {
      return new ehl($$0);
   }

   public static ehl a(dyq $$0, dyq $$1) {
      return a(egw.a($$0, $$1));
   }

   public static ehl b(dyq $$0, dyq $$1) {
      return a(egv.a($$0, $$1));
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public ehu<?> b() {
      return ehu.l;
   }
}
