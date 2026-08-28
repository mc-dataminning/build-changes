import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eon(int c, int d) {
   private static final Codec<eon> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayi.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, eon::new)
   );
   public static final Codec<eon> a = Codec.either(ayi.l, e)
      .xmap($$0 -> (eon)$$0.map(eon::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final eon b = new eon(0);

   public eon(int $$0) {
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
