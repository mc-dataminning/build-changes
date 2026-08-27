import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record br(ij<blj<?>> b) {
   public static final Codec<br> a = Codec.either(asg.b(kc.u), kb.g.r())
      .flatComapMap(
         $$0 -> (br)$$0.map($$0x -> new br(kb.g.a($$0x)), $$0x -> new br(ij.a($$0x))),
         $$0 -> {
            ij<blj<?>> $$1 = $$0.a();
            Optional<asg<blj<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static br a(blj<?> $$0) {
      return new br(ij.a($$0.r()));
   }

   public static br a(asg<blj<?>> $$0) {
      return new br(kb.g.a($$0));
   }

   public boolean b(blj<?> $$0) {
      return $$0.a(this.b);
   }

   public ij<blj<?>> a() {
      return this.b;
   }
}
