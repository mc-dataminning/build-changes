import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxy extends czm {
   public static final MapCodec<cxy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ati.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cxy::new)
   );
   private final ati b;

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   public cxy(ati $$0, djg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2) {
      return this.b.a();
   }
}
