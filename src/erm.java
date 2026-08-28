import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erm extends erk {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bty.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bty.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, erm::new)
   );
   private final bty c;
   private final bty d;

   public static erm a(bty $$0, bty $$1) {
      return new erm($$0, $$1);
   }

   public static erm a(bty $$0) {
      return new erm(btv.a(0), $$0);
   }

   public static erm b(bty $$0) {
      return new erm($$0, btv.a(0));
   }

   private erm(bty $$0, bty $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iw($$3, $$4, $$5));
   }

   @Override
   public erl<?> b() {
      return erl.n;
   }
}
