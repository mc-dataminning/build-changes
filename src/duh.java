import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duh extends dvg implements dlw {
   public static final MapCodec<duh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(duh::b), t()).apply($$0, duh::new));
   private final cyb c;

   @Override
   public MapCodec<duh> a() {
      return a;
   }

   public duh(cyb $$0, eag.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cyb b() {
      return this.c;
   }
}
