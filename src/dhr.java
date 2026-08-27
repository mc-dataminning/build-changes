import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhr extends dil implements czr {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(dhr::b), u()).apply($$0, dhr::new));
   private final cpb c;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(cpb $$0, dmy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cpb b() {
      return this.c;
   }
}
