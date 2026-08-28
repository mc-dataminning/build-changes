import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class era extends eri {
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqi.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, era::new));
   private final eqi c;

   private era(eqi $$0) {
      this.c = $$0;
   }

   public static era a(eqi $$0) {
      return new era($$0);
   }

   public static era a(ehx $$0, ehx $$1) {
      return a(eql.a($$0, $$1));
   }

   public static era b(ehx $$0, ehx $$1) {
      return a(eqk.a($$0, $$1));
   }

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public erj<?> b() {
      return erj.l;
   }
}
