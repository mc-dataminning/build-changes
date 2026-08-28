import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eew extends efb {
   private final ju<dkd> e;
   public static final MapCodec<eew> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eew::new)
   );

   public eew(kl $$0, ju<dkd> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxo $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eer<?> a() {
      return eer.a;
   }
}
