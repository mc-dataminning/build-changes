import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfi extends dgw {
   public static final MapCodec<dfi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awz.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dfi::new)
   );
   private final awz b;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(awz $$0, drc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(drd $$0, daf $$1, io $$2) {
      return this.b.a();
   }
}
