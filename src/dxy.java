import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxy extends dyg {
   public static final Codec<dxy> a = RecordCodecBuilder.create($$0 -> $$0.group(dxg.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dxy::new));
   private final dxg c;

   private dxy(dxg $$0) {
      this.c = $$0;
   }

   public static dxy a(dxg $$0) {
      return new dxy($$0);
   }

   public static dxy a(dpd $$0, dpd $$1) {
      return a(dxj.a($$0, $$1));
   }

   public static dxy b(dpd $$0, dpd $$1) {
      return a(dxi.a($$0, $$1));
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dyh<?> b() {
      return dyh.l;
   }
}
