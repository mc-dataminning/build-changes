import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efd extends efh {
   private final ju<etv> e;
   public static final MapCodec<efd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, efd::new)
   );

   public efd(kl $$0, ju<etv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eex<?> a() {
      return eex.c;
   }
}
