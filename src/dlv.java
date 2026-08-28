import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends dnj {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dlv::new)
   );
   private final ayy b;

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(ayy $$0, dxu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dxv $$0, dgn $$1, jh $$2) {
      return this.b.a();
   }
}
