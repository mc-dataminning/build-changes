import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtl extends dkd {
   public static final MapCodec<dtl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(dtl::b), t()).apply($$0, dtl::new));
   private final cvl d;

   @Override
   public MapCodec<dtl> a() {
      return c;
   }

   protected dtl(cvl $$0, dwv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvl b() {
      return this.d;
   }
}
