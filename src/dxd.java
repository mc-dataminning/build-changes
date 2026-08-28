import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxd extends dnk {
   public static final MapCodec<dxd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(dxd::b), t()).apply($$0, dxd::new));
   private final cyl c;

   @Override
   public MapCodec<dxd> a() {
      return b;
   }

   protected dxd(cyl $$0, eas.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cyl b() {
      return this.c;
   }
}
