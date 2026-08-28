import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record etb(int c, int d) {
   private static final Codec<etb> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayw.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, etb::new)
   );
   public static final Codec<etb> a = Codec.either(ayw.l, e)
      .xmap($$0 -> (etb)$$0.map(etb::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final etb b = new etb(0);

   public etb(int $$0) {
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
