import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dot extends dfp implements ctq {
   public static final MapCodec<dot> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(dot::b), u()).apply($$0, dot::new));
   private final cth d;

   @Override
   public MapCodec<dot> a() {
      return c;
   }

   protected dot(cth $$0, dsa.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cth b() {
      return this.d;
   }

   @Override
   public bta m() {
      return bta.g;
   }

   @Override
   public ji<avy> n() {
      return avz.og;
   }
}
