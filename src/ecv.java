import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecv extends edb {
   final axt<dij> a;
   public static final MapCodec<ecv> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axt.a(ma.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ecv::new)
   );

   protected ecv(kl $$0, axt<dij> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dvo $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ecr<?> a() {
      return ecr.b;
   }
}
