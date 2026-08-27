import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dvs implements dvy {
   public static final MapCodec<dvs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jr.a.fieldOf("source_entity").forGetter(dvs::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dvs(Either.right(Either.left($$0x)), $$1))
   );
   public static final yv<wi, dvs> b = yv.a(yt.f, dvs::c, yt.h, $$0 -> $$0.f, ($$0, $$1) -> new dvs(Either.right(Either.right($$0)), $$1));
   private Either<bru, Either<UUID, Integer>> e;
   private final float f;

   public dvs(bru $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dvs(Either<bru, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<euk> a(dax $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dax $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bru)$$1.map($$1x -> $$0 instanceof aqm $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bru::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bru::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dvz<dvs> a() {
      return dvz.b;
   }

   public static class a implements dvz<dvs> {
      @Override
      public MapCodec<dvs> a() {
         return dvs.a;
      }

      @Override
      public yv<wi, dvs> b() {
         return dvs.b;
      }
   }
}
