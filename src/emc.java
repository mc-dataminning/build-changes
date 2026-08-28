import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record emc(int c, int d) {
   private static final Codec<emc> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(aym.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), aym.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, emc::new)
   );
   public static final Codec<emc> a = Codec.either(aym.k, e)
      .xmap($$0 -> (emc)$$0.map(emc::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final emc b = new emc(0);

   public emc(int $$0) {
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
