import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eap implements eav {
   public static final MapCodec<eap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.fieldOf("source_entity").forGetter(eap::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new eap(Either.right(Either.left($$0x)), $$1))
   );
   public static final zh<ByteBuf, eap> b = zh.a(zf.h, eap::c, zf.k, $$0 -> $$0.f, ($$0, $$1) -> new eap(Either.right(Either.right($$0)), $$1));
   private Either<bul, Either<UUID, Integer>> e;
   private final float f;

   public eap(bul $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private eap(Either<bul, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ezy> a(dfm $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dt().b(0.0, (double)this.f, 0.0));
   }

   private void b(dfm $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bul)$$1.map($$1x -> $$0 instanceof arp $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bul::cG, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bul::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public eaw<eap> a() {
      return eaw.b;
   }

   public static class a implements eaw<eap> {
      @Override
      public MapCodec<eap> a() {
         return eap.a;
      }

      @Override
      public zh<ByteBuf, eap> b() {
         return eap.b;
      }
   }
}
