import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dxf implements dxl {
   public static final MapCodec<dxf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.a.fieldOf("source_entity").forGetter(dxf::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dxf(Either.right(Either.left($$0x)), $$1))
   );
   public static final ys<ByteBuf, dxf> b = ys.a(yq.g, dxf::c, yq.i, $$0 -> $$0.f, ($$0, $$1) -> new dxf(Either.right(Either.right($$0)), $$1));
   private Either<bsh, Either<UUID, Integer>> e;
   private final float f;

   public dxf(bsh $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dxf(Either<bsh, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ewh> a(dcg $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dp().b(0.0, (double)this.f, 0.0));
   }

   private void b(dcg $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsh)$$1.map($$1x -> $$0 instanceof aqm $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsh::cB, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsh::an, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dxm<dxf> a() {
      return dxm.b;
   }

   public static class a implements dxm<dxf> {
      @Override
      public MapCodec<dxf> a() {
         return dxf.a;
      }

      @Override
      public ys<ByteBuf, dxf> b() {
         return dxf.b;
      }
   }
}
