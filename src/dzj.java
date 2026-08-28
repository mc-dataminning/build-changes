import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dzj implements dzp {
   public static final MapCodec<dzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.a.fieldOf("source_entity").forGetter(dzj::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dzj(Either.right(Either.left($$0x)), $$1))
   );
   public static final zb<ByteBuf, dzj> b = zb.a(yz.g, dzj::c, yz.i, $$0 -> $$0.f, ($$0, $$1) -> new dzj(Either.right(Either.right($$0)), $$1));
   private Either<bto, Either<UUID, Integer>> e;
   private final float f;

   public dzj(bto $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dzj(Either<bto, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<eys> a(deg $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dq().b(0.0, (double)this.f, 0.0));
   }

   private void b(deg $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bto)$$1.map($$1x -> $$0 instanceof arh $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bto::cD, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bto::ap, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dzq<dzj> a() {
      return dzq.b;
   }

   public static class a implements dzq<dzj> {
      @Override
      public MapCodec<dzj> a() {
         return dzj.a;
      }

      @Override
      public zb<ByteBuf, dzj> b() {
         return dzj.b;
      }
   }
}
