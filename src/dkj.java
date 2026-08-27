import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dkj implements dkp {
   public static final Codec<dkj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("source_entity").forGetter(dkj::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new dkj(Either.right(Either.left($$0x)), $$1))
   );
   private Either<bjt, Either<UUID, Integer>> c;
   final float d;

   public dkj(bjt $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   dkj(Either<bjt, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<eif> a(cqz $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dj().b(0.0, (double)this.d, 0.0));
   }

   private void b(cqz $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((bjt)$$1.map($$1x -> $$0 instanceof alq $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(bjt::cv, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(bjt::ah, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dkq<?> a() {
      return dkq.b;
   }

   public static class a implements dkq<dkj> {
      public dkj a(tl $$0) {
         return new dkj(Either.right(Either.right($$0.n())), $$0.readFloat());
      }

      public void a(tl $$0, dkj $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<dkj> a() {
         return dkj.a;
      }
   }
}
