import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dxu implements dya {
   public static final MapCodec<dxu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a.fieldOf("source_entity").forGetter(dxu::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dxu(Either.right(Either.left($$0x)), $$1))
   );
   public static final yw<ByteBuf, dxu> b = yw.a(yu.g, dxu::c, yu.i, $$0 -> $$0.f, ($$0, $$1) -> new dxu(Either.right(Either.right($$0)), $$1));
   private Either<bsq, Either<UUID, Integer>> e;
   private final float f;

   public dxu(bsq $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dxu(Either<bsq, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<eww> a(dcu $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.do().b(0.0, (double)this.f, 0.0));
   }

   private void b(dcu $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsq)$$1.map($$1x -> $$0 instanceof aqt $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsq::cA, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsq::an, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dyb<dxu> a() {
      return dyb.b;
   }

   public static class a implements dyb<dxu> {
      @Override
      public MapCodec<dxu> a() {
         return dxu.a;
      }

      @Override
      public yw<ByteBuf, dxu> b() {
         return dxu.b;
      }
   }
}
