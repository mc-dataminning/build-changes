import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eef extends eej {
   private final jv<esx> e;
   public static final MapCodec<eef> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eef::new)
   );

   public eef(km $$0, jv<esx> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public edz<?> a() {
      return edz.c;
   }
}
