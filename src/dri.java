import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dri extends dsc implements djc {
   public static final MapCodec<dri> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(dri::b), t()).apply($$0, dri::new));
   private final cvl c;

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(cvl $$0, dwv.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvl b() {
      return this.c;
   }
}
