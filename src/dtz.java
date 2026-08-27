import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dtz implements duf {
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.a.fieldOf("source_entity").forGetter(dtz::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dtz(Either.right(Either.left($$0x)), $$1))
   );
   public static final yg<vt, dtz> b = yg.a(ye.f, dtz::c, ye.h, $$0 -> $$0.f, ($$0, $$1) -> new dtz(Either.right(Either.right($$0)), $$1));
   private Either<bqa, Either<UUID, Integer>> e;
   private final float f;

   public dtz(bqa $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dtz(Either<bqa, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<esj> a(czg $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dk().b(0.0, (double)this.f, 0.0));
   }

   private void b(czg $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bqa)$$1.map($$1x -> $$0 instanceof apu $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bqa::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bqa::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dug<dtz> a() {
      return dug.b;
   }

   public static class a implements dug<dtz> {
      @Override
      public Codec<dtz> a() {
         return dtz.a;
      }

      @Override
      public yg<vt, dtz> b() {
         return dtz.b;
      }
   }
}
