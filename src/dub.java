import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dub implements dtt {
   public static final Codec<dub> a = RecordCodecBuilder.create($$0 -> $$0.group(dtt.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dub::new));
   private final dtt e;

   public dub(dtt $$0) {
      this.e = $$0;
   }

   public boolean a(cxu $$0, ib $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dtu<?> a() {
      return dtu.k;
   }
}
