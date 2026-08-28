import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dth extends dnv {
   public static final MapCodec<dth> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dth::new)
   );

   @Override
   public MapCodec<dth> a() {
      return c;
   }

   public dth(ayf $$0, ean.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      eam.a($$0, $$1, $$2, $$3);
   }
}
