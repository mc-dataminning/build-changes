import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgg extends dhu {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgg::new)
   );
   private final axr b;

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dgg(axr $$0, dsa.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsb $$0, dbd $$1, iz $$2) {
      return this.b.a();
   }
}
