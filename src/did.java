import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class did extends djr {
   public static final MapCodec<did> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axw.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, did::new)
   );
   private final axw b;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(axw $$0, dtz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dua $$0, dcx $$1, je $$2) {
      return this.b.a();
   }
}
