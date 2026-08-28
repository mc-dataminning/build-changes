import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt extends dnn implements des {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(dmt::b), u()).apply($$0, dmt::new));
   private final ctk c;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(ctk $$0, dsd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ctk b() {
      return this.c;
   }
}
