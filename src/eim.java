import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eim extends eit {
   public static final MapCodec<eim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyv.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eim::new)
   );
   private final dyv.a c;

   private eim(dyv.a $$0) {
      this.c = $$0;
   }

   public static eim a(dyv.a $$0) {
      return new eim($$0);
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jd($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eiu<?> b() {
      return eiu.k;
   }
}
