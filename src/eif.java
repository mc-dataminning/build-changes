import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eif extends eid {
   public static final MapCodec<eif> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpl.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpl.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eif::new)
   );
   private final bpl c;
   private final bpl d;

   public static eif a(bpl $$0, bpl $$1) {
      return new eif($$0, $$1);
   }

   public static eif a(bpl $$0) {
      return new eif(bpi.a(0), $$0);
   }

   public static eif b(bpl $$0) {
      return new eif($$0, bpi.a(0));
   }

   private eif(bpl $$0, bpl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ja> a_(eib $$0, ayo $$1, ja $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ja($$3, $$4, $$5));
   }

   @Override
   public eie<?> b() {
      return eie.n;
   }
}
