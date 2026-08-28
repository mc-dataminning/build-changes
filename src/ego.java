import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ego implements egu {
   public static final MapCodec<ego> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.a.fieldOf("source_entity").forGetter(ego::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ego(Either.right(Either.left($$0x)), $$1))
   );
   public static final ze<ByteBuf, ego> b = ze.a(zc.h, ego::c, zc.l, $$0 -> $$0.f, ($$0, $$1) -> new ego(Either.right(Either.right($$0)), $$1));
   private Either<bxe, Either<UUID, Integer>> e;
   private final float f;

   public ego(bxe $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ego(Either<bxe, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fgc> a(dkj $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dkj $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bxe)$$1.map($$1x -> $$0 instanceof asb $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bxe::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bxe::ao, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public egv<ego> a() {
      return egv.b;
   }

   public static class a implements egv<ego> {
      @Override
      public MapCodec<ego> a() {
         return ego.a;
      }

      @Override
      public ze<ByteBuf, ego> b() {
         return ego.b;
      }
   }
}
