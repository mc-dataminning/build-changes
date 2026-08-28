import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dwy implements dxe {
   public static final MapCodec<dwy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.a.fieldOf("source_entity").forGetter(dwy::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dwy(Either.right(Either.left($$0x)), $$1))
   );
   public static final ys<ByteBuf, dwy> b = ys.a(yq.g, dwy::c, yq.i, $$0 -> $$0.f, ($$0, $$1) -> new dwy(Either.right(Either.right($$0)), $$1));
   private Either<bsd, Either<UUID, Integer>> e;
   private final float f;

   public dwy(bsd $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dwy(Either<bsd, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<evz> a(dcd $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dcd $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsd)$$1.map($$1x -> $$0 instanceof aqk $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsd::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsd::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dxf<dwy> a() {
      return dxf.b;
   }

   public static class a implements dxf<dwy> {
      @Override
      public MapCodec<dwy> a() {
         return dwy.a;
      }

      @Override
      public ys<ByteBuf, dwy> b() {
         return dwy.b;
      }
   }
}
