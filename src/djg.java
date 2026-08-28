import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djg extends dkt {
   public static final MapCodec<djg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayd.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, djg::new)
   );
   private final ayd b;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(ayd $$0, dvc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dvd $$0, dea $$1, jg $$2) {
      return this.b.a();
   }
}
