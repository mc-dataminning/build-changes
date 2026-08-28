import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record etd(int c, int d) {
   private static final Codec<etd> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayy.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, etd::new)
   );
   public static final Codec<etd> a = Codec.either(ayy.l, e)
      .xmap($$0 -> (etd)$$0.map(etd::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final etd b = new etd(0);

   public etd(int $$0) {
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
