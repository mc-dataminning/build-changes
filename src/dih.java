import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dih extends czf {
   public static final MapCodec<dih> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(dih::b), u()).apply($$0, dih::new));
   private final cnn d;

   @Override
   public MapCodec<dih> a() {
      return c;
   }

   protected dih(cnn $$0, dle.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cnn b() {
      return this.d;
   }
}
