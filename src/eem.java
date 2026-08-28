import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eem implements ees {
   public static final MapCodec<eem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a.fieldOf("source_entity").forGetter(eem::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new eem(Either.right(Either.left($$0x)), $$1))
   );
   public static final yu<ByteBuf, eem> b = yu.a(ys.h, eem::c, ys.l, $$0 -> $$0.f, ($$0, $$1) -> new eem(Either.right(Either.right($$0)), $$1));
   private Either<bwa, Either<UUID, Integer>> e;
   private final float f;

   public eem(bwa $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private eem(Either<bwa, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fdw> a(dip $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dip $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bwa)$$1.map($$1x -> $$0 instanceof aro $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bwa::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bwa::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public eet<eem> a() {
      return eet.b;
   }

   public static class a implements eet<eem> {
      @Override
      public MapCodec<eem> a() {
         return eem.a;
      }

      @Override
      public yu<ByteBuf, eem> b() {
         return eem.b;
      }
   }
}
