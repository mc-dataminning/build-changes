import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record esn(int c, int d) {
   private static final Codec<esn> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayu.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, esn::new)
   );
   public static final Codec<esn> a = Codec.either(ayu.l, e)
      .xmap($$0 -> (esn)$$0.map(esn::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final esn b = new esn(0);

   public esn(int $$0) {
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
