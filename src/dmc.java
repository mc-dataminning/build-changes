import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmc extends dnr {
   public static final MapCodec<dmc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayd.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dmc::new)
   );
   private final ayd b;

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(ayd $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dym $$0, dgv $$1, jj $$2) {
      return this.b.a();
   }
}
