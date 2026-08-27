import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ded extends dfr {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awq.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, ded::new)
   );
   private final awq b;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(awq $$0, dpx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dpy $$0, cza $$1, im $$2) {
      return this.b.a();
   }
}
