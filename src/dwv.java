import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dwv implements dxb {
   public static final MapCodec<dwv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a.fieldOf("source_entity").forGetter(dwv::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dwv(Either.right(Either.left($$0x)), $$1))
   );
   public static final zn<ByteBuf, dwv> b = zn.a(zl.g, dwv::c, zl.i, $$0 -> $$0.f, ($$0, $$1) -> new dwv(Either.right(Either.right($$0)), $$1));
   private Either<bsw, Either<UUID, Integer>> e;
   private final float f;

   public dwv(bsw $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dwv(Either<bsw, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<evt> a(dca $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dca $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsw)$$1.map($$1x -> $$0 instanceof arf $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsw::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsw::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dxc<dwv> a() {
      return dxc.b;
   }

   public static class a implements dxc<dwv> {
      @Override
      public MapCodec<dwv> a() {
         return dwv.a;
      }

      @Override
      public zn<ByteBuf, dwv> b() {
         return dwv.b;
      }
   }
}
