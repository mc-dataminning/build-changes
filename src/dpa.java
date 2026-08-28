import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpa extends dfw implements ctc {
   public static final MapCodec<dpa> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(dpa::b), u()).apply($$0, dpa::new));
   private final cst d;

   @Override
   public MapCodec<dpa> a() {
      return c;
   }

   protected dpa(cst $$0, dsg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cst b() {
      return this.d;
   }

   @Override
   public bsk m() {
      return bsk.g;
   }

   @Override
   public jj<ave> n() {
      return avf.og;
   }
}
