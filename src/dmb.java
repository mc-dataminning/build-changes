import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmb implements dlt {
   public static final Codec<dmb> a = RecordCodecBuilder.create($$0 -> $$0.group(dlt.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dmb::new));
   private final dlt e;

   public dmb(dlt $$0) {
      this.e = $$0;
   }

   public boolean a(cqv $$0, gw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dlu<?> a() {
      return dlu.k;
   }
}
