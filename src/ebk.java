import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebk extends ebo {
   private final jr<eqa> e;
   public static final MapCodec<ebk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kc.a(lv.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ebk::new)
   );

   public ebk(ki $$0, jr<eqa> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ebe<?> a() {
      return ebe.c;
   }
}
