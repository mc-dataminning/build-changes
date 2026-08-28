import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ege implements egk {
   public static final MapCodec<ege> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.a.fieldOf("source_entity").forGetter(ege::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ege(Either.right(Either.left($$0x)), $$1))
   );
   public static final za<ByteBuf, ege> b = za.a(yy.h, ege::c, yy.l, $$0 -> $$0.f, ($$0, $$1) -> new ege(Either.right(Either.right($$0)), $$1));
   private Either<bwv, Either<UUID, Integer>> e;
   private final float f;

   public ege(bwv $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ege(Either<bwv, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ffs> a(djz $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(djz $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bwv)$$1.map($$1x -> $$0 instanceof aru $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bwv::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bwv::ao, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public egl<ege> a() {
      return egl.b;
   }

   public static class a implements egl<ege> {
      @Override
      public MapCodec<ege> a() {
         return ege.a;
      }

      @Override
      public za<ByteBuf, ege> b() {
         return ege.b;
      }
   }
}
