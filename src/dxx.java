import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dxx implements dyd {
   public static final MapCodec<dxx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a.fieldOf("source_entity").forGetter(dxx::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dxx(Either.right(Either.left($$0x)), $$1))
   );
   public static final yx<ByteBuf, dxx> b = yx.a(yv.g, dxx::c, yv.i, $$0 -> $$0.f, ($$0, $$1) -> new dxx(Either.right(Either.right($$0)), $$1));
   private Either<bsr, Either<UUID, Integer>> e;
   private final float f;

   public dxx(bsr $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dxx(Either<bsr, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<exa> a(dcw $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dcw $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsr)$$1.map($$1x -> $$0 instanceof aqu $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsr::cA, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsr::an, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dye<dxx> a() {
      return dye.b;
   }

   public static class a implements dye<dxx> {
      @Override
      public MapCodec<dxx> a() {
         return dxx.a;
      }

      @Override
      public yx<ByteBuf, dxx> b() {
         return dxx.b;
      }
   }
}
