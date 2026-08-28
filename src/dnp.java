import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnp extends doj implements dfn {
   public static final MapCodec<dnp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dnp::b), u()).apply($$0, dnp::new));
   private final ctg c;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(ctg $$0, dsz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ctg b() {
      return this.c;
   }
}
