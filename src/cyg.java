import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyg extends czu {
   public static final MapCodec<cyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(atj.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cyg::new)
   );
   private final atj b;

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   public cyg(atj $$0, djo.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2) {
      return this.b.a();
   }
}
