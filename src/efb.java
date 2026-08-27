import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efb extends eew {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnw.b(eew.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, efb::new)
   );
   private final bnw<eew> b;

   public efb(bnw<eew> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayg $$0, dww $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eex<?> a() {
      return eex.f;
   }
}
