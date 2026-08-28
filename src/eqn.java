import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqn extends eqi {
   public static final MapCodec<eqn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btb.b(eqi.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eqn::new)
   );
   private final btb<eqi> b;

   public eqn(btb<eqi> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azx $$0, eia $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public eqj<?> a() {
      return eqj.f;
   }
}
