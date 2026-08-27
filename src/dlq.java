import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlq extends dmk implements ddp {
   public static final MapCodec<dlq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(dlq::b), u()).apply($$0, dlq::new));
   private final csh c;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(csh $$0, dra.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public csh b() {
      return this.c;
   }
}
