import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhe extends dis {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axg.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dhe::new)
   );
   private final axg b;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(axg $$0, dsz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dta $$0, dca $$1, jd $$2) {
      return this.b.a();
   }
}
