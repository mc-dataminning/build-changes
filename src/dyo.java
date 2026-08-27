import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyo extends dyv {
   public static final Codec<dyo> a = RecordCodecBuilder.create($$0 -> $$0.group(doy.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dyo::new));
   private final doy.a c;

   private dyo(doy.a $$0) {
      this.c = $$0;
   }

   public static dyo a(doy.a $$0) {
      return new dyo($$0);
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hx($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dyw<?> b() {
      return dyw.k;
   }
}
