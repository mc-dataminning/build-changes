import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djm extends dkz {
   public static final MapCodec<djm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aye.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, djm::new)
   );
   private final aye b;

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   public djm(aye $$0, dvi.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dvj $$0, deg $$1, jh $$2) {
      return this.b.a();
   }
}
