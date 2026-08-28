import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzs extends dzy {
   final awm<dfi> a;
   public static final MapCodec<dzs> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.a(lr.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzs::new)
   );

   protected dzs(ke $$0, awm<dfi> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsl $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzo<?> a() {
      return dzo.b;
   }
}
