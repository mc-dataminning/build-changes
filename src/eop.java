import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eop extends eon {
   public static final MapCodec<eop> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bsv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eop::new)
   );
   private final bsv c;
   private final bsv d;

   public static eop a(bsv $$0, bsv $$1) {
      return new eop($$0, $$1);
   }

   public static eop a(bsv $$0) {
      return new eop(bss.a(0), $$0);
   }

   public static eop b(bsv $$0) {
      return new eop($$0, bss.a(0));
   }

   private eop(bsv $$0, bsv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jj($$3, $$4, $$5));
   }

   @Override
   public eoo<?> b() {
      return eoo.n;
   }
}
