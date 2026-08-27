import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkn extends dlh implements dcm {
   public static final MapCodec<dkn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dkn::b), u()).apply($$0, dkn::new));
   private final cqw c;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(cqw $$0, dpx.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cqw b() {
      return this.c;
   }
}
