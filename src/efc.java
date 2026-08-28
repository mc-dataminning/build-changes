import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efc extends efh {
   private final ju<dkl> e;
   public static final MapCodec<efc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, efc::new)
   );

   public efc(kl $$0, ju<dkl> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eex<?> a() {
      return eex.a;
   }
}
