import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgj extends cxh {
   public static final MapCodec<dgj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(dgj::b), u()).apply($$0, dgj::new));
   private final clm d;

   @Override
   public MapCodec<dgj> a() {
      return c;
   }

   protected dgj(clm $$0, djg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public clm b() {
      return this.d;
   }
}
