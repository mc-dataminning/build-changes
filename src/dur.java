import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dur extends dup {
   public static final Codec<dur> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgd.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bgd.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dur::new)
   );
   private final bgd c;
   private final bgd d;

   public static dur a(bgd $$0, bgd $$1) {
      return new dur($$0, $$1);
   }

   public static dur a(bgd $$0) {
      return new dur(bga.a(0), $$0);
   }

   public static dur b(bgd $$0) {
      return new dur($$0, bga.a(0));
   }

   private dur(bgd $$0, bgd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gw($$3, $$4, $$5));
   }

   @Override
   public duq<?> b() {
      return duq.n;
   }
}
