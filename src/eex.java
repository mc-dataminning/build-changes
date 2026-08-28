import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eex extends efb {
   private final ju<etp> e;
   public static final MapCodec<eex> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eex::new)
   );

   public eex(kl $$0, ju<etp> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxo $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eer<?> a() {
      return eer.c;
   }
}
