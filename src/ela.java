import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ela extends eky {
   public static final MapCodec<ela> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brd.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brd.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ela::new)
   );
   private final brd c;
   private final brd d;

   public static ela a(brd $$0, brd $$1) {
      return new ela($$0, $$1);
   }

   public static ela a(brd $$0) {
      return new ela(bra.a(0), $$0);
   }

   public static ela b(brd $$0) {
      return new ela($$0, bra.a(0));
   }

   private ela(brd $$0, brd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jg($$3, $$4, $$5));
   }

   @Override
   public ekz<?> b() {
      return ekz.n;
   }
}
