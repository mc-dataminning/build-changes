import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record elo(int c, int d) {
   private static final Codec<elo> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayl.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayl.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, elo::new)
   );
   public static final Codec<elo> a = Codec.either(ayl.k, e)
      .xmap($$0 -> (elo)$$0.map(elo::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final elo b = new elo(0);

   public elo(int $$0) {
      this($$0, $$0);
   }

   public boolean a() {
      return this.d == this.c;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
