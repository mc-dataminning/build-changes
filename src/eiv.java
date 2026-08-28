import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eiv extends eit {
   public static final MapCodec<eiv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eiv::new)
   );
   private final bpv c;
   private final bpv d;

   public static eiv a(bpv $$0, bpv $$1) {
      return new eiv($$0, $$1);
   }

   public static eiv a(bpv $$0) {
      return new eiv(bps.a(0), $$0);
   }

   public static eiv b(bpv $$0) {
      return new eiv($$0, bps.a(0));
   }

   private eiv(bpv $$0, bpv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jd($$3, $$4, $$5));
   }

   @Override
   public eiu<?> b() {
      return eiu.n;
   }
}
