import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ekr(int c, int d) {
   private static final Codec<ekr> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(axw.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), axw.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, ekr::new)
   );
   public static final Codec<ekr> a = Codec.either(axw.k, e)
      .xmap($$0 -> (ekr)$$0.map(ekr::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final ekr b = new ekr(0);

   public ekr(int $$0) {
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
