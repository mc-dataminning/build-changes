import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmd implements dlz {
   public static final Codec<dmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hy.v(16).optionalFieldOf("offset", gw.b).forGetter($$0x -> $$0x.e)).apply($$0, dmd::new)
   );
   private final hy e;

   public dmd(hy $$0) {
      this.e = $$0;
   }

   public boolean a(cqp $$0, gw $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dma<?> a() {
      return dma.h;
   }
}
