import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dze extends dzk {
   final axe<dex> a;
   public static final MapCodec<dze> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dze::new)
   );

   protected dze(kd $$0, axe<dex> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsa $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dza<?> a() {
      return dza.b;
   }
}
