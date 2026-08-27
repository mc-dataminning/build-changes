import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dvu implements dwa {
   public static final MapCodec<dvu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jr.a.fieldOf("source_entity").forGetter(dvu::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dvu(Either.right(Either.left($$0x)), $$1))
   );
   public static final yv<wi, dvu> b = yv.a(yt.f, dvu::c, yt.h, $$0 -> $$0.f, ($$0, $$1) -> new dvu(Either.right(Either.right($$0)), $$1));
   private Either<brw, Either<UUID, Integer>> e;
   private final float f;

   public dvu(brw $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dvu(Either<brw, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<eum> a(daz $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(daz $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((brw)$$1.map($$1x -> $$0 instanceof aqn $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(brw::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(brw::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dwb<dvu> a() {
      return dwb.b;
   }

   public static class a implements dwb<dvu> {
      @Override
      public MapCodec<dvu> a() {
         return dvu.a;
      }

      @Override
      public yv<wi, dvu> b() {
         return dvu.b;
      }
   }
}
