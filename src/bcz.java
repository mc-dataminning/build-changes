import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bcz extends bdc {
   public static final bcz a = new bcz(0);
   public static final Codec<bcz> b = Codec.either(
         Codec.INT, RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("value").forGetter($$0x -> $$0x.f)).apply($$0, bcz::new))
      )
      .xmap($$0 -> (bcz)$$0.map(bcz::a, $$0x -> $$0x), $$0 -> Either.left($$0.f));
   private final int f;

   public static bcz a(int $$0) {
      return $$0 == 0 ? a : new bcz($$0);
   }

   private bcz(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(apf $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bdd<?> c() {
      return bdd.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
