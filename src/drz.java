import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz extends dst implements djv {
   public static final MapCodec<drz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(drz::b), t()).apply($$0, drz::new));
   private final cwh c;

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(cwh $$0, dxm.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwh b() {
      return this.c;
   }
}
