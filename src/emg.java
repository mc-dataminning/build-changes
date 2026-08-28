import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record emg(int c, int d) {
   private static final Codec<emg> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayo.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayo.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, emg::new)
   );
   public static final Codec<emg> a = Codec.either(ayo.k, e)
      .xmap($$0 -> (emg)$$0.map(emg::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final emg b = new emg(0);

   public emg(int $$0) {
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
