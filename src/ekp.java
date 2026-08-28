import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ekp(int c, int d) {
   private static final Codec<ekp> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(axw.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), axw.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, ekp::new)
   );
   public static final Codec<ekp> a = Codec.either(axw.k, e)
      .xmap($$0 -> (ekp)$$0.map(ekp::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final ekp b = new ekp(0);

   public ekp(int $$0) {
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
