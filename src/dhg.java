import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhg extends diu {
   public static final MapCodec<dhg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axh.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dhg::new)
   );
   private final axh b;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(axh $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dtc $$0, dcc $$1, jd $$2) {
      return this.b.a();
   }
}
