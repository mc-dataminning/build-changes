import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlx implements dlt {
   public static final Codec<dlx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hy.v(16).optionalFieldOf("offset", gw.b).forGetter($$0x -> $$0x.e)).apply($$0, dlx::new)
   );
   private final hy e;

   public dlx(hy $$0) {
      this.e = $$0;
   }

   public boolean a(cqv $$0, gw $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dlu<?> a() {
      return dlu.h;
   }
}
