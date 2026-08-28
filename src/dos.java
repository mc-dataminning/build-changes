import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dfo implements ctp {
   public static final MapCodec<dos> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dos::b), u()).apply($$0, dos::new));
   private final ctg d;

   @Override
   public MapCodec<dos> a() {
      return c;
   }

   protected dos(ctg $$0, drz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ctg b() {
      return this.d;
   }

   @Override
   public bsz m() {
      return bsz.g;
   }

   @Override
   public ji<avy> n() {
      return avz.og;
   }
}
