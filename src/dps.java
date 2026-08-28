import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps extends dgn implements ctq {
   public static final MapCodec<dps> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dps::b), u()).apply($$0, dps::new));
   private final ctg d;

   @Override
   public MapCodec<dps> a() {
      return c;
   }

   protected dps(ctg $$0, dsz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ctg b() {
      return this.d;
   }

   @Override
   public bsx m() {
      return bsx.g;
   }

   @Override
   public jm<avn> n() {
      return avo.og;
   }
}
