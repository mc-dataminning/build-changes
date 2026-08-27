import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddq extends dek implements cvq {
   public static final MapCodec<ddq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckv.q.fieldOf("color").forGetter(ddq::b), u()).apply($$0, ddq::new));
   private final ckv c;

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(ckv $$0, dio.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ckv b() {
      return this.c;
   }
}
