import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duo extends dvn implements dmd {
   public static final MapCodec<duo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(duo::b), t()).apply($$0, duo::new));
   private final cyi c;

   @Override
   public MapCodec<duo> a() {
      return a;
   }

   public duo(cyi $$0, ean.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cyi b() {
      return this.c;
   }
}
