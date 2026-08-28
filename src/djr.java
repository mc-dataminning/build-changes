import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djr extends dle {
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, djr::new)
   );
   private final ayh b;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(ayh $$0, dvn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dvo $$0, dek $$1, jh $$2) {
      return this.b.a();
   }
}
