import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts extends dup implements dll {
   public static final MapCodec<dts> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dts::b), t()).apply($$0, dts::new));
   private final cxq c;

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   public dts(cxq $$0, dzn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cxq b() {
      return this.c;
   }
}
