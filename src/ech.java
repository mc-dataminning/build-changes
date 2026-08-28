import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class ech implements ecn {
   public static final MapCodec<ech> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.fieldOf("source_entity").forGetter(ech::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new ech(Either.right(Either.left($$0x)), $$1))
   );
   public static final zt<ByteBuf, ech> b = zt.a(zr.h, ech::c, zr.l, $$0 -> $$0.f, ($$0, $$1) -> new ech(Either.right(Either.right($$0)), $$1));
   private Either<bvf, Either<UUID, Integer>> e;
   private final float f;

   public ech(bvf $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private ech(Either<bvf, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fbs> a(dha $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dha $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bvf)$$1.map($$1x -> $$0 instanceof ash $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bvf::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bvf::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public eco<ech> a() {
      return eco.b;
   }

   public static class a implements eco<ech> {
      @Override
      public MapCodec<ech> a() {
         return ech.a;
      }

      @Override
      public zt<ByteBuf, ech> b() {
         return ech.b;
      }
   }
}
