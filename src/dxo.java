import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxo extends dxv {
   public static final Codec<dxo> a = RecordCodecBuilder.create($$0 -> $$0.group(dny.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dxo::new));
   private final dny.a c;

   private dxo(dny.a $$0) {
      this.c = $$0;
   }

   public static dxo a(dny.a $$0) {
      return new dxo($$0);
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hv($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dxw<?> b() {
      return dxw.k;
   }
}
