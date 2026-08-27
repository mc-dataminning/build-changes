import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dup implements duv {
   public static final Codec<dup> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.a.fieldOf("source_entity").forGetter(dup::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dup(Either.right(Either.left($$0x)), $$1))
   );
   public static final yq<wd, dup> b = yq.a(yo.f, dup::c, yo.h, $$0 -> $$0.f, ($$0, $$1) -> new dup(Either.right(Either.right($$0)), $$1));
   private Either<bql, Either<UUID, Integer>> e;
   private final float f;

   public dup(bql $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dup(Either<bql, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<etf> a(czu $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dl().b(0.0, (double)this.f, 0.0));
   }

   private void b(czu $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bql)$$1.map($$1x -> $$0 instanceof aqe $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bql::cx, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bql::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public duw<dup> a() {
      return duw.b;
   }

   public static class a implements duw<dup> {
      @Override
      public Codec<dup> a() {
         return dup.a;
      }

      @Override
      public yq<wd, dup> b() {
         return dup.b;
      }
   }
}
