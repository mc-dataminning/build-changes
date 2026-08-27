import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg extends dqh {
   public static final dqg a = new dqg(die.a(0));
   public static final Codec<dqg> b = Codec.either(
         die.a, RecordCodecBuilder.create($$0 -> $$0.group(die.a.fieldOf("value").forGetter($$0x -> $$0x.d)).apply($$0, dqg::new))
      )
      .xmap($$0 -> (dqg)$$0.map(dqg::a, $$0x -> $$0x), $$0 -> Either.left($$0.d));
   private final die d;

   public static dqg a(die $$0) {
      return new dqg($$0);
   }

   private dqg(die $$0) {
      this.d = $$0;
   }

   public die b() {
      return this.d;
   }

   @Override
   public int a(apf $$0, dih $$1) {
      return this.d.a($$1);
   }

   @Override
   public dqi<?> a() {
      return dqi.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
