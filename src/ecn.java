import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ecn implements ect {
   public static final MapCodec<ecn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.a.fieldOf("source_entity").forGetter(ecn::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ecn(Either.right(Either.left($$0x)), $$1))
   );
   public static final yn<ByteBuf, ecn> b = yn.a(yl.h, ecn::c, yl.l, $$0 -> $$0.f, ($$0, $$1) -> new ecn(Either.right(Either.right($$0)), $$1));
   private Either<bva, Either<UUID, Integer>> e;
   private final float f;

   public ecn(bva $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ecn(Either<bva, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fbx> a(dgz $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.ds().b(0.0, (double)this.f, 0.0));
   }

   private void b(dgz $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bva)$$1.map($$1x -> $$0 instanceof ard $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bva::cF, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bva::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public ecu<ecn> a() {
      return ecu.b;
   }

   public static class a implements ecu<ecn> {
      @Override
      public MapCodec<ecn> a() {
         return ecn.a;
      }

      @Override
      public yn<ByteBuf, ecn> b() {
         return ecn.b;
      }
   }
}
