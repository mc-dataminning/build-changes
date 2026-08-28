import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efb extends efh {
   final ayk<dkl> a;
   public static final MapCodec<efb> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.a(mb.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, efb::new)
   );

   protected efb(kl $$0, ayk<dkl> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eex<?> a() {
      return eex.b;
   }
}
