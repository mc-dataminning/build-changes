import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dgj implements dgp {
   public static final Codec<dgj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hy.a.fieldOf("source_entity").forGetter(dgj::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new dgj(Either.right(Either.left($$0x)), $$1))
   );
   private Either<bfj, Either<UUID, Integer>> c;
   final float d;

   public dgj(bfj $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   dgj(Either<bfj, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<eei> a(cmm $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dg().b(0.0, (double)this.d, 0.0));
   }

   private void b(cmm $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((bfj)$$1.map($$1x -> $$0 instanceof aif $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(bfj::ct, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(bfj::af, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dgq<?> a() {
      return dgq.b;
   }

   public static class a implements dgq<dgj> {
      public dgj a(sf $$0) {
         return new dgj(Either.right(Either.right($$0.m())), $$0.readFloat());
      }

      public void a(sf $$0, dgj $$1) {
         $$0.d($$1.c());
         $$0.writeFloat($$1.d);
      }

      @Override
      public Codec<dgj> a() {
         return dgj.a;
      }
   }
}
