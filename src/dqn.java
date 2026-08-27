import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqn implements dqf {
   public static final Codec<dqn> a = RecordCodecBuilder.create($$0 -> $$0.group(dqf.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dqn::new));
   private final dqf e;

   public dqn(dqf $$0) {
      this.e = $$0;
   }

   public boolean a(cus $$0, hx $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dqg<?> a() {
      return dqg.k;
   }
}
