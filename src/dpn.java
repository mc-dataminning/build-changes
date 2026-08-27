import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dpn implements dpt {
   public static final Codec<dpn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jc.a.fieldOf("source_entity").forGetter(dpn::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dpn(Either.right(Either.left($$0x)), $$1))
   );
   public static final xo<vb, dpn> b = xo.a(xm.d, dpn::c, xm.f, $$0 -> $$0.f, ($$0, $$1) -> new dpn(Either.right(Either.right($$0)), $$1));
   private Either<bno, Either<UUID, Integer>> e;
   private final float f;

   public dpn(bno $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dpn(Either<bno, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ens> a(cvn $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dk().b(0.0, (double)this.f, 0.0));
   }

   private void b(cvn $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bno)$$1.map($$1x -> $$0 instanceof aov $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bno::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bno::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dpu<dpn> a() {
      return dpu.b;
   }

   public static class a implements dpu<dpn> {
      @Override
      public Codec<dpn> a() {
         return dpn.a;
      }

      @Override
      public xo<vb, dpn> b() {
         return dpn.b;
      }
   }
}
