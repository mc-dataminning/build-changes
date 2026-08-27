import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dmx implements dnd {
   public static final Codec<dmx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iy.a.fieldOf("source_entity").forGetter(dmx::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new dmx(Either.right(Either.left($$0x)), $$1))
   );
   private Either<blf, Either<UUID, Integer>> c;
   final float d;

   public dmx(blf $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   dmx(Either<blf, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<elb> a(csy $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dk().b(0.0, (double)this.d, 0.0));
   }

   private void b(csy $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((blf)$$1.map($$1x -> $$0 instanceof amp $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(blf::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(blf::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dne<?> a() {
      return dne.b;
   }

   public static class a implements dne<dmx> {
      public dmx a(ue $$0) {
         return new dmx(Either.right(Either.right($$0.n())), $$0.readFloat());
      }

      public void a(ue $$0, dmx $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<dmx> a() {
         return dmx.a;
      }
   }
}
