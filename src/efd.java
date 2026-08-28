import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efd extends efi {
   private final ju<dkm> e;
   public static final MapCodec<efd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, efd::new)
   );

   public efd(kl $$0, ju<dkm> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eey<?> a() {
      return eey.a;
   }
}
