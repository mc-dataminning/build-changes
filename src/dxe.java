import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dxe implements dxk {
   public static final MapCodec<dxe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.a.fieldOf("source_entity").forGetter(dxe::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dxe(Either.right(Either.left($$0x)), $$1))
   );
   public static final ys<ByteBuf, dxe> b = ys.a(yq.g, dxe::c, yq.i, $$0 -> $$0.f, ($$0, $$1) -> new dxe(Either.right(Either.right($$0)), $$1));
   private Either<bsg, Either<UUID, Integer>> e;
   private final float f;

   public dxe(bsg $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dxe(Either<bsg, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ewf> a(dcf $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.do().b(0.0, (double)this.f, 0.0));
   }

   private void b(dcf $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bsg)$$1.map($$1x -> $$0 instanceof aqm $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bsg::cA, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bsg::am, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dxl<dxe> a() {
      return dxl.b;
   }

   public static class a implements dxl<dxe> {
      @Override
      public MapCodec<dxe> a() {
         return dxe.a;
      }

      @Override
      public ys<ByteBuf, dxe> b() {
         return dxe.b;
      }
   }
}
