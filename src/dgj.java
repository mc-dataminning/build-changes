import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgj extends dhx {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axs.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgj::new)
   );
   private final axs b;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(axs $$0, dsd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dse $$0, dbg $$1, iz $$2) {
      return this.b.a();
   }
}
