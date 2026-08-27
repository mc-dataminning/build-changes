import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsd implements drv {
   public static final Codec<dsd> a = RecordCodecBuilder.create($$0 -> $$0.group(drv.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dsd::new));
   private final drv e;

   public dsd(drv $$0) {
      this.e = $$0;
   }

   public boolean a(cwi $$0, hz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public drw<?> a() {
      return drw.k;
   }
}
