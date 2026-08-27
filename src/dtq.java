import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dtq implements dtw {
   public static final Codec<dtq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.a.fieldOf("source_entity").forGetter(dtq::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dtq(Either.right(Either.left($$0x)), $$1))
   );
   public static final ye<vr, dtq> b = ye.a(yc.f, dtq::c, yc.h, $$0 -> $$0.f, ($$0, $$1) -> new dtq(Either.right(Either.right($$0)), $$1));
   private Either<bpv, Either<UUID, Integer>> e;
   private final float f;

   public dtq(bpv $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dtq(Either<bpv, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<esa> a(cyx $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dk().b(0.0, (double)this.f, 0.0));
   }

   private void b(cyx $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bpv)$$1.map($$1x -> $$0 instanceof aps $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bpv::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bpv::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dtx<dtq> a() {
      return dtx.b;
   }

   public static class a implements dtx<dtq> {
      @Override
      public Codec<dtq> a() {
         return dtq.a;
      }

      @Override
      public ye<vr, dtq> b() {
         return dtq.b;
      }
   }
}
