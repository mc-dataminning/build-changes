import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bs(hi<bja<?>> b) {
   public static final Codec<bs> a = Codec.either(aqk.b(jc.t), jb.h.r())
      .flatComapMap(
         $$0 -> (bs)$$0.map($$0x -> new bs(jb.h.a($$0x)), $$0x -> new bs(hi.a($$0x))),
         $$0 -> {
            hi<bja<?>> $$1 = $$0.a();
            Optional<aqk<bja<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bs a(bja<?> $$0) {
      return new bs(hi.a($$0.r()));
   }

   public static bs a(aqk<bja<?>> $$0) {
      return new bs(jb.h.a($$0));
   }

   public boolean b(bja<?> $$0) {
      return $$0.a(this.b);
   }

   public hi<bja<?>> a() {
      return this.b;
   }
}
