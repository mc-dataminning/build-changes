import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elh extends elp {
   public static final MapCodec<elh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ekp.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, elh::new));
   private final ekp c;

   private elh(ekp $$0) {
      this.c = $$0;
   }

   public static elh a(ekp $$0) {
      return new elh($$0);
   }

   public static elh a(eck $$0, eck $$1) {
      return a(eks.a($$0, $$1));
   }

   public static elh b(eck $$0, eck $$1) {
      return a(ekr.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(eln $$0, azu $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public elq<?> b() {
      return elq.l;
   }
}
