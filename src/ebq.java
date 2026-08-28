import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ebq implements ebw {
   public static final MapCodec<ebq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.a.fieldOf("source_entity").forGetter(ebq::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ebq(Either.right(Either.left($$0x)), $$1))
   );
   public static final yn<ByteBuf, ebq> b = yn.a(yl.h, ebq::c, yl.l, $$0 -> $$0.f, ($$0, $$1) -> new ebq(Either.right(Either.right($$0)), $$1));
   private Either<buk, Either<UUID, Integer>> e;
   private final float f;

   public ebq(buk $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ebq(Either<buk, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<faz> a(dgh $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dgh $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((buk)$$1.map($$1x -> $$0 instanceof ard $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(buk::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(buk::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public ebx<ebq> a() {
      return ebx.b;
   }

   public static class a implements ebx<ebq> {
      @Override
      public MapCodec<ebq> a() {
         return ebq.a;
      }

      @Override
      public yn<ByteBuf, ebq> b() {
         return ebq.b;
      }
   }
}
