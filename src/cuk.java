import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cuk extends cvw {
   public static final MapCodec<cuk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aqw.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, cuk::new)
   );
   private final aqw b;

   @Override
   public MapCodec<cuk> a() {
      return a;
   }

   public cuk(aqw $$0, dfc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int d(dfd $$0, cph $$1, gw $$2) {
      return this.b.a();
   }
}
