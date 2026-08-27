import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dno implements dnu {
   public static final Codec<dno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.a.fieldOf("source_entity").forGetter(dno::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new dno(Either.right(Either.left($$0x)), $$1))
   );
   private Either<blu, Either<UUID, Integer>> c;
   final float d;

   public dno(blu $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   dno(Either<blu, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<els> a(cto $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.dk().b(0.0, (double)this.d, 0.0));
   }

   private void b(cto $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((blu)$$1.map($$1x -> $$0 instanceof and $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(blu::cw, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return (Integer)this.c.map(blu::aj, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dnv<?> a() {
      return dnv.b;
   }

   public static class a implements dnv<dno> {
      public dno a(ui $$0) {
         return new dno(Either.right(Either.right($$0.n())), $$0.readFloat());
      }

      public void a(ui $$0, dno $$1) {
         $$0.c($$1.c());
         $$0.a($$1.d);
      }

      @Override
      public Codec<dno> a() {
         return dno.a;
      }
   }
}
