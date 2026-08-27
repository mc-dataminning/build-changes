import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dqp implements dqv {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.a.fieldOf("source_entity").forGetter(dqp::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dqp(Either.right(Either.left($$0x)), $$1))
   );
   public static final xq<vd, dqp> b = xq.a(xo.d, dqp::c, xo.f, $$0 -> $$0.f, ($$0, $$1) -> new dqp(Either.right(Either.right($$0)), $$1));
   private Either<bof, Either<UUID, Integer>> e;
   private final float f;

   public dqp(bof $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dqp(Either<bof, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<eov> a(cwe $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dh().b(0.0, (double)this.f, 0.0));
   }

   private void b(cwe $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bof)$$1.map($$1x -> $$0 instanceof apa $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bof::ct, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bof::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dqw<dqp> a() {
      return dqw.b;
   }

   public static class a implements dqw<dqp> {
      @Override
      public Codec<dqp> a() {
         return dqp.a;
      }

      @Override
      public xq<vd, dqp> b() {
         return dqp.b;
      }
   }
}
