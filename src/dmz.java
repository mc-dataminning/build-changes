import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmz extends ddv {
   public static final MapCodec<dmz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dmz::b), u()).apply($$0, dmz::new));
   private final crs d;

   @Override
   public MapCodec<dmz> a() {
      return c;
   }

   protected dmz(crs $$0, dqg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public crs b() {
      return this.d;
   }
}
