import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dpu implements dqa {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jc.a.fieldOf("source_entity").forGetter(dpu::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dpu(Either.right(Either.left($$0x)), $$1))
   );
   public static final xo<vb, dpu> b = xo.a(xm.d, dpu::c, xm.f, $$0 -> $$0.f, ($$0, $$1) -> new dpu(Either.right(Either.right($$0)), $$1));
   private Either<bnq, Either<UUID, Integer>> e;
   private final float f;

   public dpu(bnq $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dpu(Either<bnq, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<enz> a(cvr $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dk().b(0.0, (double)this.f, 0.0));
   }

   private void b(cvr $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bnq)$$1.map($$1x -> $$0 instanceof aow $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bnq::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bnq::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dqb<dpu> a() {
      return dqb.b;
   }

   public static class a implements dqb<dpu> {
      @Override
      public Codec<dpu> a() {
         return dpu.a;
      }

      @Override
      public xo<vb, dpu> b() {
         return dpu.b;
      }
   }
}
