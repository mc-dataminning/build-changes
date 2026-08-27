import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dye extends dym {
   public static final Codec<dye> a = RecordCodecBuilder.create($$0 -> $$0.group(dxm.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dye::new));
   private final dxm c;

   private dye(dxm $$0) {
      this.c = $$0;
   }

   public static dye a(dxm $$0) {
      return new dye($$0);
   }

   public static dye a(dpj $$0, dpj $$1) {
      return a(dxp.a($$0, $$1));
   }

   public static dye b(dpj $$0, dpj $$1) {
      return a(dxo.a($$0, $$1));
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dyn<?> b() {
      return dyn.l;
   }
}
