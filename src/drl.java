import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class drl implements drr {
   public static final Codec<drl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.a.fieldOf("source_entity").forGetter(drl::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new drl(Either.right(Either.left($$0x)), $$1))
   );
   public static final xs<vf, drl> b = xs.a(xq.d, drl::c, xq.f, $$0 -> $$0.f, ($$0, $$1) -> new drl(Either.right(Either.right($$0)), $$1));
   private Either<bow, Either<UUID, Integer>> e;
   private final float f;

   public drl(bow $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private drl(Either<bow, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<epr> a(cwz $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dk().b(0.0, (double)this.f, 0.0));
   }

   private void b(cwz $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bow)$$1.map($$1x -> $$0 instanceof apf $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bow::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bow::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public drs<drl> a() {
      return drs.b;
   }

   public static class a implements drs<drl> {
      @Override
      public Codec<drl> a() {
         return drl.a;
      }

      @Override
      public xs<vf, drl> b() {
         return drl.b;
      }
   }
}
