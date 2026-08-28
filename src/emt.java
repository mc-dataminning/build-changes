import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emt extends emr {
   public static final MapCodec<emt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brn.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brn.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, emt::new)
   );
   private final brn c;
   private final brn d;

   public static emt a(brn $$0, brn $$1) {
      return new emt($$0, $$1);
   }

   public static emt a(brn $$0) {
      return new emt(brk.a(0), $$0);
   }

   public static emt b(brn $$0) {
      return new emt($$0, brk.a(0));
   }

   private emt(brn $$0, brn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ji> a_(emp $$0, azg $$1, ji $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ji($$3, $$4, $$5));
   }

   @Override
   public ems<?> b() {
      return ems.n;
   }
}
