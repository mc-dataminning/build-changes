import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egs extends egq {
   public static final MapCodec<egs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boz.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), boz.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, egs::new)
   );
   private final boz c;
   private final boz d;

   public static egs a(boz $$0, boz $$1) {
      return new egs($$0, $$1);
   }

   public static egs a(boz $$0) {
      return new egs(bow.a(0), $$0);
   }

   public static egs b(boz $$0) {
      return new egs($$0, bow.a(0));
   }

   private egs(boz $$0, boz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new io($$3, $$4, $$5));
   }

   @Override
   public egr<?> b() {
      return egr.n;
   }
}
