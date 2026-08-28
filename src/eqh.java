import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqh extends eqp {
   public static final MapCodec<eqh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(epp.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eqh::new));
   private final epp c;

   private eqh(epp $$0) {
      this.c = $$0;
   }

   public static eqh a(epp $$0) {
      return new eqh($$0);
   }

   public static eqh a(ehh $$0, ehh $$1) {
      return a(eps.a($$0, $$1));
   }

   public static eqh b(ehh $$0, ehh $$1) {
      return a(epr.a($$0, $$1));
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eqq<?> b() {
      return eqq.l;
   }
}
