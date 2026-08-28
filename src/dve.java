import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dve extends dwd implements dmt {
   public static final MapCodec<dve> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dve::b), t()).apply($$0, dve::new));
   private final cyw c;

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(cyw $$0, ebd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cyw b() {
      return this.c;
   }
}
