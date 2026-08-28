import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwr extends dmy {
   public static final MapCodec<dwr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(dwr::b), t()).apply($$0, dwr::new));
   private final cyb c;

   @Override
   public MapCodec<dwr> a() {
      return b;
   }

   protected dwr(cyb $$0, eag.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cyb b() {
      return this.c;
   }
}
