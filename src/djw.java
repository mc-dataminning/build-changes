import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djw extends dat {
   public static final MapCodec<djw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(djw::b), u()).apply($$0, djw::new));
   private final cpd d;

   @Override
   public MapCodec<djw> a() {
      return c;
   }

   protected djw(cpd $$0, dna.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cpd b() {
      return this.d;
   }
}
