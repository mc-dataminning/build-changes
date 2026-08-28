import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtm extends dke {
   public static final MapCodec<dtm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(dtm::b), t()).apply($$0, dtm::new));
   private final cvm d;

   @Override
   public MapCodec<dtm> a() {
      return c;
   }

   protected dtm(cvm $$0, dww.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvm b() {
      return this.d;
   }
}
