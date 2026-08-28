import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class efr implements efx {
   public static final MapCodec<efr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.a.fieldOf("source_entity").forGetter(efr::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new efr(Either.right(Either.left($$0x)), $$1))
   );
   public static final yw<ByteBuf, efr> b = yw.a(yu.h, efr::c, yu.l, $$0 -> $$0.f, ($$0, $$1) -> new efr(Either.right(Either.right($$0)), $$1));
   private Either<bwi, Either<UUID, Integer>> e;
   private final float f;

   public efr(bwi $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private efr(Either<bwi, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ffc> a(djm $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.ds().b(0.0, (double)this.f, 0.0));
   }

   private void b(djm $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bwi)$$1.map($$1x -> $$0 instanceof arq $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bwi::cF, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bwi::ao, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public efy<efr> a() {
      return efy.b;
   }

   public static class a implements efy<efr> {
      @Override
      public MapCodec<efr> a() {
         return efr.a;
      }

      @Override
      public yw<ByteBuf, efr> b() {
         return efr.b;
      }
   }
}
