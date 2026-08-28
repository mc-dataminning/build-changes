import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtx extends dol {
   public static final MapCodec<dtx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dtx::new)
   );

   @Override
   public MapCodec<dtx> a() {
      return c;
   }

   public dtx(ayh $$0, ebd.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      ebc.a($$0, $$1, $$2, $$3);
   }
}
