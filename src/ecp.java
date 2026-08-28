import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ecp implements ecv {
   public static final MapCodec<ecp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.fieldOf("source_entity").forGetter(ecp::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ecp(Either.right(Either.left($$0x)), $$1))
   );
   public static final zt<ByteBuf, ecp> b = zt.a(zr.h, ecp::c, zr.l, $$0 -> $$0.f, ($$0, $$1) -> new ecp(Either.right(Either.right($$0)), $$1));
   private Either<bvk, Either<UUID, Integer>> e;
   private final float f;

   public ecp(bvk $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ecp(Either<bvk, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fby> a(dhi $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.du().b(0.0, (double)this.f, 0.0));
   }

   private void b(dhi $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bvk)$$1.map($$1x -> $$0 instanceof ash $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bvk::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bvk::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public ecw<ecp> a() {
      return ecw.b;
   }

   public static class a implements ecw<ecp> {
      @Override
      public MapCodec<ecp> a() {
         return ecp.a;
      }

      @Override
      public zt<ByteBuf, ecp> b() {
         return ecp.b;
      }
   }
}
