import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxo implements dxg {
   public static final Codec<dxo> a = RecordCodecBuilder.create($$0 -> $$0.group(dxg.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dxo::new));
   private final dxg e;

   public dxo(dxg $$0) {
      this.e = $$0;
   }

   public boolean a(day $$0, in $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dxh<?> a() {
      return dxh.k;
   }
}
