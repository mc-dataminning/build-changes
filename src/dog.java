import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dog implements dny {
   public static final Codec<dog> a = RecordCodecBuilder.create($$0 -> $$0.group(dny.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dog::new));
   private final dny e;

   public dog(dny $$0) {
      this.e = $$0;
   }

   public boolean a(csu $$0, ht $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dnz<?> a() {
      return dnz.k;
   }
}
