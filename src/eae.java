import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eae implements eak {
   public static final MapCodec<eae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.fieldOf("source_entity").forGetter(eae::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new eae(Either.right(Either.left($$0x)), $$1))
   );
   public static final zg<ByteBuf, eae> b = zg.a(ze.h, eae::c, ze.j, $$0 -> $$0.f, ($$0, $$1) -> new eae(Either.right(Either.right($$0)), $$1));
   private Either<bue, Either<UUID, Integer>> e;
   private final float f;

   public eae(bue $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private eae(Either<bue, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ezn> a(dfb $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dv().b(0.0, (double)this.f, 0.0));
   }

   private void b(dfb $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bue)$$1.map($$1x -> $$0 instanceof arn $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bue::cH, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bue::as, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public eal<eae> a() {
      return eal.b;
   }

   public static class a implements eal<eae> {
      @Override
      public MapCodec<eae> a() {
         return eae.a;
      }

      @Override
      public zg<ByteBuf, eae> b() {
         return eae.b;
      }
   }
}
