import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc extends edi {
   final axs<diq> a;
   public static final MapCodec<edc> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axs.a(ma.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, edc::new)
   );

   protected edc(kl $$0, axs<diq> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dvv $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ecy<?> a() {
      return ecy.b;
   }
}
