import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekg extends ekn {
   public static final MapCodec<ekg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ekg::new)
   );
   private final eao.a c;

   private ekg(eao.a $$0) {
      this.c = $$0;
   }

   public static ekg a(eao.a $$0) {
      return new ekg($$0);
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jf($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eko<?> b() {
      return eko.k;
   }
}
