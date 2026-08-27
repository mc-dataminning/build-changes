import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpo extends dft {
   public static final MapCodec<dpo> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(dpo::b), u()).apply($$0, dpo::new));
   private final csy d;

   @Override
   public MapCodec<dpo> a() {
      return c;
   }

   protected dpo(csy $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public csy b() {
      return this.d;
   }
}
