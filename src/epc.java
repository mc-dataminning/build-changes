import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record epc(int c, int d) {
   private static final Codec<epc> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.l.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), azn.l.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, epc::new)
   );
   public static final Codec<epc> a = Codec.either(azn.l, e)
      .xmap($$0 -> (epc)$$0.map(epc::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final epc b = new epc(0);

   public epc(int $$0) {
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
