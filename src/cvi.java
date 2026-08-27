import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvi extends cwu {
   public static final MapCodec<cvi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(art.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, cvi::new)
   );
   private final art b;

   @Override
   public MapCodec<cvi> a() {
      return a;
   }

   public cvi(art $$0, dga.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int d(dgb $$0, cqf $$1, ht $$2) {
      return this.b.a();
   }
}
