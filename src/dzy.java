import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dzy implements eae {
   public static final MapCodec<dzy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kj.a.fieldOf("source_entity").forGetter(dzy::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dzy(Either.right(Either.left($$0x)), $$1))
   );
   public static final zf<ByteBuf, dzy> b = zf.a(zd.h, dzy::c, zd.j, $$0 -> $$0.f, ($$0, $$1) -> new dzy(Either.right(Either.right($$0)), $$1));
   private Either<btz, Either<UUID, Integer>> e;
   private final float f;

   public dzy(btz $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dzy(Either<btz, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<ezh> a(dev $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dv().b(0.0, (double)this.f, 0.0));
   }

   private void b(dev $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((btz)$$1.map($$1x -> $$0 instanceof arm $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(btz::cH, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(btz::ar, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public eaf<dzy> a() {
      return eaf.b;
   }

   public static class a implements eaf<dzy> {
      @Override
      public MapCodec<dzy> a() {
         return dzy.a;
      }

      @Override
      public zf<ByteBuf, dzy> b() {
         return dzy.b;
      }
   }
}
