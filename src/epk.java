import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record epk(int c, int d) {
   private static final Codec<epk> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), azn.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, epk::new)
   );
   public static final Codec<epk> a = Codec.either(azn.l, e)
      .xmap($$0 -> (epk)$$0.map(epk::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final epk b = new epk(0);

   public epk(int $$0) {
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
