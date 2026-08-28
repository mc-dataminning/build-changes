import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class edk implements edq {
   public static final MapCodec<edk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.a.fieldOf("source_entity").forGetter(edk::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new edk(Either.right(Either.left($$0x)), $$1))
   );
   public static final yt<ByteBuf, edk> b = yt.a(yr.h, edk::c, yr.l, $$0 -> $$0.f, ($$0, $$1) -> new edk(Either.right(Either.right($$0)), $$1));
   private Either<bvs, Either<UUID, Integer>> e;
   private final float f;

   public edk(bvs $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private edk(Either<bvs, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fcu> a(dhp $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dhp $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bvs)$$1.map($$1x -> $$0 instanceof arn $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bvs::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bvs::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public edr<edk> a() {
      return edr.b;
   }

   public static class a implements edr<edk> {
      @Override
      public MapCodec<edk> a() {
         return edk.a;
      }

      @Override
      public yt<ByteBuf, edk> b() {
         return edk.b;
      }
   }
}
