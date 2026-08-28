import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eok(int c, int d) {
   private static final Codec<eok> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), ayh.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, eok::new)
   );
   public static final Codec<eok> a = Codec.either(ayh.l, e)
      .xmap($$0 -> (eok)$$0.map(eok::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final eok b = new eok(0);

   public eok(int $$0) {
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
