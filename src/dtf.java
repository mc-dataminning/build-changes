import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dtf implements dsx {
   public static final Codec<dtf> a = RecordCodecBuilder.create($$0 -> $$0.group(dsx.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dtf::new));
   private final dsx e;

   public dtf(dsx $$0) {
      this.e = $$0;
   }

   public boolean a(cwz $$0, ib $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dsy<?> a() {
      return dsy.k;
   }
}
