import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record epd(int c, int d) {
   private static final Codec<epd> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(azd.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), azd.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, epd::new)
   );
   public static final Codec<epd> a = Codec.either(azd.l, e)
      .xmap($$0 -> (epd)$$0.map(epd::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final epd b = new epd(0);

   public epd(int $$0) {
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
