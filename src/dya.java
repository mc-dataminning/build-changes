import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dya extends doh {
   public static final MapCodec<dya> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dya::b), t()).apply($$0, dya::new));
   private final czi c;

   @Override
   public MapCodec<dya> a() {
      return b;
   }

   protected dya(czi $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public czi b() {
      return this.c;
   }
}
