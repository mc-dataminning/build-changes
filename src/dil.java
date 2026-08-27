import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dil extends czj {
   public static final MapCodec<dil> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(dil::b), u()).apply($$0, dil::new));
   private final cnr d;

   @Override
   public MapCodec<dil> a() {
      return c;
   }

   protected dil(cnr $$0, dli.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cnr b() {
      return this.d;
   }
}
