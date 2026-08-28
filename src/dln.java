import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dln extends dnb {
   public static final MapCodec<dln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dln::new)
   );
   private final ayy b;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(ayy $$0, dxm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dxn $$0, dgf $$1, jh $$2) {
      return this.b.a();
   }
}
