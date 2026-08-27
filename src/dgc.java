import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgc extends cxa {
   public static final MapCodec<dgc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(dgc::b), u()).apply($$0, dgc::new));
   private final clf d;

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   protected dgc(clf $$0, diz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public clf b() {
      return this.d;
   }
}
