import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class def extends cvk {
   public static final MapCodec<def> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjp.q.fieldOf("color").forGetter(def::b), t()).apply($$0, def::new));
   private final cjp d;

   @Override
   public MapCodec<def> a() {
      return c;
   }

   protected def(cjp $$0, dgv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cjp b() {
      return this.d;
   }
}
