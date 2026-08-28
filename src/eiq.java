import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eiq extends eiy {
   public static final MapCodec<eiq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ehx.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eiq::new));
   private final ehx c;

   private eiq(ehx $$0) {
      this.c = $$0;
   }

   public static eiq a(ehx $$0) {
      return new eiq($$0);
   }

   public static eiq a(dzs $$0, dzs $$1) {
      return a(eia.a($$0, $$1));
   }

   public static eiq b(dzs $$0, dzs $$1) {
      return a(ehz.a($$0, $$1));
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eiz<?> b() {
      return eiz.l;
   }
}
