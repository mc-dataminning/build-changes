import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eni(int c, int d) {
   private static final Codec<eni> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayv.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayv.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, eni::new)
   );
   public static final Codec<eni> a = Codec.either(ayv.l, e)
      .xmap($$0 -> (eni)$$0.map(eni::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final eni b = new eni(0);

   public eni(int $$0) {
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
