import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class djl implements djr {
   public static final Codec<djl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hx.a.fieldOf("source_entity").forGetter(djl::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new djl(Either.right(Either.left($$0x)), $$1))
   );
   private Either<biw, Either<UUID, Integer>> c;
   final float d;

   public djl(biw $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   djl(Either<biw, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<ehh> a(cqb $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dj().b(0.0, (double)this.d, 0.0));
   }

   private void b(cqb $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((biw)$$1.map($$1x -> $$0 instanceof akt $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(biw::cv, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(biw::ah, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public djs<?> a() {
      return djs.b;
   }

   public static class a implements djs<djl> {
      public djl a(so $$0) {
         return new djl(Either.right(Either.right($$0.n())), $$0.readFloat());
      }

      public void a(so $$0, djl $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<djl> a() {
         return djl.a;
      }
   }
}
