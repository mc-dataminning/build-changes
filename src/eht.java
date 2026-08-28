import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eht extends ehr {
   public static final MapCodec<eht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpz.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpz.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eht::new)
   );
   private final bpz c;
   private final bpz d;

   public static eht a(bpz $$0, bpz $$1) {
      return new eht($$0, $$1);
   }

   public static eht a(bpz $$0) {
      return new eht(bpw.a(0), $$0);
   }

   public static eht b(bpz $$0) {
      return new eht($$0, bpw.a(0));
   }

   private eht(bpz $$0, bpz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public ehs<?> b() {
      return ehs.n;
   }
}
