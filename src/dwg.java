import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwg implements dvy {
   public static final Codec<dwg> a = RecordCodecBuilder.create($$0 -> $$0.group(dvy.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dwg::new));
   private final dvy e;

   public dwg(dvy $$0) {
      this.e = $$0;
   }

   public boolean a(czs $$0, ib $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dvz<?> a() {
      return dvz.k;
   }
}
