import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djy extends dll {
   public static final MapCodec<djy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayg.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, djy::new)
   );
   private final ayg b;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(ayg $$0, dvu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dvv $$0, der $$1, jh $$2) {
      return this.b.a();
   }
}
