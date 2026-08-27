import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxz extends dyg {
   public static final Codec<dxz> a = RecordCodecBuilder.create($$0 -> $$0.group(doj.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dxz::new));
   private final doj.a c;

   private dxz(doj.a $$0) {
      this.c = $$0;
   }

   public static dxz a(doj.a $$0) {
      return new dxz($$0);
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hx($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dyh<?> b() {
      return dyh.k;
   }
}
