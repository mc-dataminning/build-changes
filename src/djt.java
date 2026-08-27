import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class djt implements djz {
   public static final Codec<djt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ia.a.fieldOf("source_entity").forGetter(djt::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new djt(Either.right(Either.left($$0x)), $$1))
   );
   private Either<bis, Either<UUID, Integer>> c;
   final float d;

   public djt(bis $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   djt(Either<bis, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<ehp> a(cpx $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dj().b(0.0, (double)this.d, 0.0));
   }

   private void b(cpx $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((bis)$$1.map($$1x -> $$0 instanceof aks $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(bis::cv, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(bis::ah, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dka<?> a() {
      return dka.b;
   }

   public static class a implements dka<djt> {
      public djt a(sq $$0) {
         return new djt(Either.right(Either.right($$0.m())), $$0.readFloat());
      }

      public void a(sq $$0, djt $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<djt> a() {
         return djt.a;
      }
   }
}
