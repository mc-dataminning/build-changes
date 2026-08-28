import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ekm(int c, int d) {
   private static final Codec<ekm> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(axv.k.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), axv.k.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
            .apply($$0, ekm::new)
   );
   public static final Codec<ekm> a = Codec.either(axv.k, e)
      .xmap($$0 -> (ekm)$$0.map(ekm::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final ekm b = new ekm(0);

   public ekm(int $$0) {
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
