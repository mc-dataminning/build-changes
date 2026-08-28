import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dws implements dwy {
   public static final MapCodec<dws> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a.fieldOf("source_entity").forGetter(dws::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
            .apply($$0, ($$0x, $$1) -> new dws(Either.right(Either.left($$0x)), $$1))
   );
   public static final zm<ByteBuf, dws> b = zm.a(zk.g, dws::c, zk.i, $$0 -> $$0.f, ($$0, $$1) -> new dws(Either.right(Either.right($$0)), $$1));
   private Either<bst, Either<UUID, Integer>> e;
   private final float f;

   public dws(bst $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private dws(Either<bst, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<evq> a(dbx $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dn().b(0.0, (double)this.f, 0.0));
   }

   private void b(dbx $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bst)$$1.map($$1x -> $$0 instanceof are $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bst::cz, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   private int c() {
      return (Integer)this.e.map(bst::al, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public dwz<dws> a() {
      return dwz.b;
   }

   public static class a implements dwz<dws> {
      @Override
      public MapCodec<dws> a() {
         return dws.a;
      }

      @Override
      public zm<ByteBuf, dws> b() {
         return dws.b;
      }
   }
}
