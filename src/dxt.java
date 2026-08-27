import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dxt implements dxz {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ju.a.fieldOf("source_entity").forGetter(dxt::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dxt(Either.right(Either.left($$0x)), $$1))
   );
   public static final zc<wp, dxt> b = zc.a(za.g, dxt::c, za.i, $$0 -> $$0.f, ($$0, $$1) -> new dxt(Either.right(Either.right($$0)), $$1));
   private Either<brv, Either<UUID, Integer>> e;
   private final float f;

   public dxt(brv $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dxt(Either<brv, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ewu> a(dca $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.ds().b(0.0, (double)this.f, 0.0));
   }

   private void b(dca $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((brv)$$1.map($$1x -> $$0 instanceof aqt $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(brv::cE, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(brv::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dya<dxt> a() {
      return dya.b;
   }

   public static class a implements dya<dxt> {
      @Override
      public Codec<dxt> a() {
         return dxt.a;
      }

      @Override
      public zc<wp, dxt> b() {
         return dxt.b;
      }
   }
}
