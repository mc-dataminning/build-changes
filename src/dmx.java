import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmx extends dnr implements dew {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(dmx::b), u()).apply($$0, dmx::new));
   private final cst c;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(cst $$0, dsg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cst b() {
      return this.c;
   }
}
