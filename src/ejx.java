import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ejx(int c, int d) {
   private static final Codec<ejx> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(axo.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), axo.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, ejx::new)
   );
   public static final Codec<ejx> a = Codec.either(axo.k, e)
      .xmap($$0 -> (ejx)$$0.map(ejx::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final ejx b = new ejx(0);

   public ejx(int $$0) {
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
