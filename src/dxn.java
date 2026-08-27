import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxn extends dxv {
   public static final Codec<dxn> a = RecordCodecBuilder.create($$0 -> $$0.group(dwv.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dxn::new));
   private final dwv c;

   private dxn(dwv $$0) {
      this.c = $$0;
   }

   public static dxn a(dwv $$0) {
      return new dxn($$0);
   }

   public static dxn a(dos $$0, dos $$1) {
      return a(dwy.a($$0, $$1));
   }

   public static dxn b(dos $$0, dos $$1) {
      return a(dwx.a($$0, $$1));
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dxw<?> b() {
      return dxw.l;
   }
}
