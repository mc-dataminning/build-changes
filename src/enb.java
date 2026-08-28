import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record enb(int c, int d) {
   private static final Codec<enb> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayw.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, enb::new)
   );
   public static final Codec<enb> a = Codec.either(ayw.l, e)
      .xmap($$0 -> (enb)$$0.map(enb::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final enb b = new enb(0);

   public enb(int $$0) {
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
