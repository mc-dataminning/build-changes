import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ebr implements ebx {
   public static final MapCodec<ebr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.a.fieldOf("source_entity").forGetter(ebr::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ebr(Either.right(Either.left($$0x)), $$1))
   );
   public static final ym<ByteBuf, ebr> b = ym.a(yk.h, ebr::c, yk.l, $$0 -> $$0.f, ($$0, $$1) -> new ebr(Either.right(Either.right($$0)), $$1));
   private Either<buk, Either<UUID, Integer>> e;
   private final float f;

   public ebr(buk $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ebr(Either<buk, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fba> a(dgi $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.du().b(0.0, (double)this.f, 0.0));
   }

   private void b(dgi $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((buk)$$1.map($$1x -> $$0 instanceof arc $$2 ? $$2.a($$1x) : null, $$0::a))))
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
   public eby<ebr> a() {
      return eby.b;
   }

   public static class a implements eby<ebr> {
      @Override
      public MapCodec<ebr> a() {
         return ebr.a;
      }

      @Override
      public ym<ByteBuf, ebr> b() {
         return ebr.b;
      }
   }
}
