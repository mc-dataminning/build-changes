import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deg extends dfa implements cwg {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(deg::b), u()).apply($$0, deg::new));
   private final cll c;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(cll $$0, djf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cll b() {
      return this.c;
   }
}
