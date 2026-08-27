import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgj extends dhd implements cyj {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(dgj::b), u()).apply($$0, dgj::new));
   private final cnr c;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(cnr $$0, dli.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cnr b() {
      return this.c;
   }
}
