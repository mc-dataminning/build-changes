import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eir extends eiy {
   public static final MapCodec<eir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyy.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eir::new)
   );
   private final dyy.a c;

   private eir(dyy.a $$0) {
      this.c = $$0;
   }

   public static eir a(dyy.a $$0) {
      return new eir($$0);
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jd($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eiz<?> b() {
      return eiz.k;
   }
}
