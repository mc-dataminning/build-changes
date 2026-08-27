import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgi extends cxg {
   public static final MapCodec<dgi> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(dgi::b), u()).apply($$0, dgi::new));
   private final cll d;

   @Override
   public MapCodec<dgi> a() {
      return c;
   }

   protected dgi(cll $$0, djf.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cll b() {
      return this.d;
   }
}
