import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmc implements dlu {
   public static final Codec<dmc> a = RecordCodecBuilder.create($$0 -> $$0.group(dlu.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dmc::new));
   private final dlu e;

   public dmc(dlu $$0) {
      this.e = $$0;
   }

   public boolean a(cqk $$0, gw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dlv<?> a() {
      return dlv.k;
   }
}
