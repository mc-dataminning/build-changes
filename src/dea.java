import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dea extends deu implements cwa {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(dea::b), u()).apply($$0, dea::new));
   private final clf c;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(clf $$0, diz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public clf b() {
      return this.c;
   }
}
