import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqe implements dpw {
   public static final Codec<dqe> a = RecordCodecBuilder.create($$0 -> $$0.group(dpw.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dqe::new));
   private final dpw e;

   public dqe(dpw $$0) {
      this.e = $$0;
   }

   public boolean a(cuj $$0, hx $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dpx<?> a() {
      return dpx.k;
   }
}
