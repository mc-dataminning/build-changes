import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record esb(int c, int d) {
   private static final Codec<esb> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayu.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, esb::new)
   );
   public static final Codec<esb> a = Codec.either(ayu.l, e)
      .xmap($$0 -> (esb)$$0.map(esb::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final esb b = new esb(0);

   public esb(int $$0) {
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
