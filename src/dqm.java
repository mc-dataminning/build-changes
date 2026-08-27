import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm extends dqh {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bch.b(dqh.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dqm::new)
   );
   private final bch<dqh> b;

   public dqm(bch<dqh> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(apf $$0, dih $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dqi<?> a() {
      return dqi.f;
   }
}
