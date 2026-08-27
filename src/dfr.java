import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfr extends cwq {
   public static final MapCodec<dfr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckv.q.fieldOf("color").forGetter(dfr::b), u()).apply($$0, dfr::new));
   private final ckv d;

   @Override
   public MapCodec<dfr> a() {
      return c;
   }

   protected dfr(ckv $$0, dio.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ckv b() {
      return this.d;
   }
}
