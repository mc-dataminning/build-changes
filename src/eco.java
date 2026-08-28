import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eco implements ecu {
   public static final MapCodec<eco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.fieldOf("source_entity").forGetter(eco::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new eco(Either.right(Either.left($$0x)), $$1))
   );
   public static final zt<ByteBuf, eco> b = zt.a(zr.h, eco::c, zr.l, $$0 -> $$0.f, ($$0, $$1) -> new eco(Either.right(Either.right($$0)), $$1));
   private Either<bvj, Either<UUID, Integer>> e;
   private final float f;

   public eco(bvj $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private eco(Either<bvj, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fbx> a(dhh $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dhh $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bvj)$$1.map($$1x -> $$0 instanceof ash $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bvj::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bvj::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public ecv<eco> a() {
      return ecv.b;
   }

   public static class a implements ecv<eco> {
      @Override
      public MapCodec<eco> a() {
         return eco.a;
      }

      @Override
      public zt<ByteBuf, eco> b() {
         return eco.b;
      }
   }
}
