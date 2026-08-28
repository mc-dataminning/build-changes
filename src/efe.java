import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efe extends efi {
   private final ju<etw> e;
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kf.a(mb.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, efe::new)
   );

   public efe(kl $$0, ju<etw> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eey<?> a() {
      return eey.c;
   }
}
