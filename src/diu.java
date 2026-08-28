import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diu extends dki {
   public static final MapCodec<diu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axz.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, diu::new)
   );
   private final axz b;

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public diu(axz $$0, dur.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dus $$0, ddo $$1, jf $$2) {
      return this.b.a();
   }
}
