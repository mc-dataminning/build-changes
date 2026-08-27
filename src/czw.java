import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czw extends dbk {
   public static final MapCodec<czw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avb.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, czw::new)
   );
   private final avb b;

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public czw(avb $$0, dle.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dlf $$0, cut $$1, hz $$2) {
      return this.b.a();
   }
}
