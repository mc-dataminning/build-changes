import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgi extends dhw {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axs.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgi::new)
   );
   private final axs b;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(axs $$0, dsc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsd $$0, dbf $$1, iz $$2) {
      return this.b.a();
   }
}
