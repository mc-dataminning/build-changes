import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyn extends dyv {
   public static final Codec<dyn> a = RecordCodecBuilder.create($$0 -> $$0.group(dxv.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dyn::new));
   private final dxv c;

   private dyn(dxv $$0) {
      this.c = $$0;
   }

   public static dyn a(dxv $$0) {
      return new dyn($$0);
   }

   public static dyn a(dps $$0, dps $$1) {
      return a(dxy.a($$0, $$1));
   }

   public static dyn b(dps $$0, dps $$1) {
      return a(dxx.a($$0, $$1));
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dyw<?> b() {
      return dyw.l;
   }
}
