import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eev extends efb {
   final aya<dkd> a;
   public static final MapCodec<eev> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(aya.a(mb.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eev::new)
   );

   protected eev(kl $$0, aya<dkd> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dxo $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eer<?> a() {
      return eer.b;
   }
}
