import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dwt implements dwz {
   public static final MapCodec<dwt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a.fieldOf("source_entity").forGetter(dwt::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dwt(Either.right(Either.left($$0x)), $$1))
   );
   public static final zn<ByteBuf, dwt> b = zn.a(zl.g, dwt::c, zl.i, $$0 -> $$0.f, ($$0, $$1) -> new dwt(Either.right(Either.right($$0)), $$1));
   private Either<bsu, Either<UUID, Integer>> e;
   private final float f;

   public dwt(bsu $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dwt(Either<bsu, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<evr> a(dby $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dby $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsu)$$1.map($$1x -> $$0 instanceof arf $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsu::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsu::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dxa<dwt> a() {
      return dxa.b;
   }

   public static class a implements dxa<dwt> {
      @Override
      public MapCodec<dwt> a() {
         return dwt.a;
      }

      @Override
      public zn<ByteBuf, dwt> b() {
         return dwt.b;
      }
   }
}
