import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esm extends eru {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esm::new)
   );
   private final axf<cuh> b;

   private esm(List<ets> $$0, axf<cuh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<esm> b() {
      return erx.G;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      cui.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eru.a<?> a(axf<cuh> $$0) {
      return a($$1 -> new esm($$1, $$0));
   }
}
