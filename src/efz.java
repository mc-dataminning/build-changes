import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efz extends egd {
   private final jw<eus> e;
   public static final MapCodec<efz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kh.a(me.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, efz::new)
   );

   public efz(kn $$0, jw<eus> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eft<?> a() {
      return eft.c;
   }
}
