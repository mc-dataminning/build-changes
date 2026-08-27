import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dle implements dlk {
   public static final Codec<dle> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("source_entity").forGetter(dle::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new dle(Either.right(Either.left($$0x)), $$1))
   );
   private Either<bki, Either<UUID, Integer>> c;
   final float d;

   public dle(bki $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   dle(Either<bki, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<eji> a(crs $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dj().b(0.0, (double)this.d, 0.0));
   }

   private void b(crs $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((bki)$$1.map($$1x -> $$0 instanceof ama $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(bki::cv, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(bki::ah, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dll<?> a() {
      return dll.b;
   }

   public static class a implements dll<dle> {
      public dle a(tu $$0) {
         return new dle(Either.right(Either.right($$0.n())), $$0.readFloat());
      }

      public void a(tu $$0, dle $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<dle> a() {
         return dle.a;
      }
   }
}
