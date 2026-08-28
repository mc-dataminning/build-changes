import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwy extends dnf {
   public static final MapCodec<dwy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(dwy::b), t()).apply($$0, dwy::new));
   private final cyi c;

   @Override
   public MapCodec<dwy> a() {
      return b;
   }

   protected dwy(cyi $$0, ean.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cyi b() {
      return this.c;
   }
}
