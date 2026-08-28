import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqm extends equ {
   public static final MapCodec<eqm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(epu.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eqm::new));
   private final epu c;

   private eqm(epu $$0) {
      this.c = $$0;
   }

   public static eqm a(epu $$0) {
      return new eqm($$0);
   }

   public static eqm a(ehm $$0, ehm $$1) {
      return a(epx.a($$0, $$1));
   }

   public static eqm b(ehm $$0, ehm $$1) {
      return a(epw.a($$0, $$1));
   }

   @Override
   public Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eqv<?> b() {
      return eqv.l;
   }
}
