import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class der extends cvr {
   public static final MapCodec<der> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(der::b), u()).apply($$0, der::new));
   private final cjx d;

   @Override
   public MapCodec<der> a() {
      return c;
   }

   protected der(cjx $$0, dhh.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cjx b() {
      return this.d;
   }
}
