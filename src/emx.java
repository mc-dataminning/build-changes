import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record emx(int c, int d) {
   private static final Codec<emx> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayt.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayt.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, emx::new)
   );
   public static final Codec<emx> a = Codec.either(ayt.l, e)
      .xmap($$0 -> (emx)$$0.map(emx::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final emx b = new emx(0);

   public emx(int $$0) {
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
