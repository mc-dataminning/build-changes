import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgh extends dhv {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axs.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgh::new)
   );
   private final axs b;

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(axs $$0, dsb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsc $$0, dbe $$1, iz $$2) {
      return this.b.a();
   }
}
