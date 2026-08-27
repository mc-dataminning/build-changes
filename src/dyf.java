import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyf extends dyn {
   public static final Codec<dyf> a = RecordCodecBuilder.create($$0 -> $$0.group(dxn.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dyf::new));
   private final dxn c;

   private dyf(dxn $$0) {
      this.c = $$0;
   }

   public static dyf a(dxn $$0) {
      return new dyf($$0);
   }

   public static dyf a(dpk $$0, dpk $$1) {
      return a(dxq.a($$0, $$1));
   }

   public static dyf b(dpk $$0, dpk $$1) {
      return a(dxp.a($$0, $$1));
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dyo<?> b() {
      return dyo.l;
   }
}
