import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dyv implements dzb {
   public static final MapCodec<dyv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.a.fieldOf("source_entity").forGetter(dyv::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dyv(Either.right(Either.left($$0x)), $$1))
   );
   public static final zb<ByteBuf, dyv> b = zb.a(yz.g, dyv::c, yz.i, $$0 -> $$0.f, ($$0, $$1) -> new dyv(Either.right(Either.right($$0)), $$1));
   private Either<btj, Either<UUID, Integer>> e;
   private final float f;

   public dyv(btj $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dyv(Either<btj, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<eye> a(dds $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dq().b(0.0, (double)this.f, 0.0));
   }

   private void b(dds $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((btj)$$1.map($$1x -> $$0 instanceof arg $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(btj::cD, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(btj::ap, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dzc<dyv> a() {
      return dzc.b;
   }

   public static class a implements dzc<dyv> {
      @Override
      public MapCodec<dyv> a() {
         return dyv.a;
      }

      @Override
      public zb<ByteBuf, dyv> b() {
         return dyv.b;
      }
   }
}
