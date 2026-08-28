import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drf extends dia implements cus {
   public static final MapCodec<drf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(drf::b), u()).apply($$0, drf::new));
   private final cuj d;

   @Override
   public MapCodec<drf> a() {
      return c;
   }

   protected drf(cuj $$0, dun.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cuj b() {
      return this.d;
   }

   @Override
   public btw l() {
      return btw.g;
   }

   @Override
   public jn<awd> m() {
      return awe.oh;
   }
}
