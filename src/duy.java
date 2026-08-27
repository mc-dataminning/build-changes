import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class duy implements dve {
   public static final Codec<duy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.a.fieldOf("source_entity").forGetter(duy::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new duy(Either.right(Either.left($$0x)), $$1))
   );
   public static final ys<wf, duy> b = ys.a(yq.f, duy::c, yq.h, $$0 -> $$0.f, ($$0, $$1) -> new duy(Either.right(Either.right($$0)), $$1));
   private Either<brh, Either<UUID, Integer>> e;
   private final float f;

   public duy(brh $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private duy(Either<brh, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<etp> a(dad $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dl().b(0.0, (double)this.f, 0.0));
   }

   private void b(dad $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((brh)$$1.map($$1x -> $$0 instanceof aqh $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(brh::cx, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(brh::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dvf<duy> a() {
      return dvf.b;
   }

   public static class a implements dvf<duy> {
      @Override
      public Codec<duy> a() {
         return duy.a;
      }

      @Override
      public ys<wf, duy> b() {
         return duy.b;
      }
   }
}
