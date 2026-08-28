import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwz<StoredEntityType extends efx> {
   private static final Codec<? extends bwz<?>> a = jz.a.xmap(bwz::new, bwz::c);
   private static final yy<ByteBuf, ? extends bwz<?>> b = jz.g.a(bwz::new, bwz::c);
   private Either<UUID, StoredEntityType> c;

   public static <Type extends efx> Codec<bwz<Type>> a() {
      return (Codec<bwz<Type>>)a;
   }

   public static <Type extends efx> yy<ByteBuf, bwz<Type>> b() {
      return (yy<ByteBuf, bwz<Type>>)b;
   }

   public bwz(StoredEntityType $$0) {
      this.c = Either.right($$0);
   }

   public bwz(UUID $$0) {
      this.c = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.c.map($$0 -> $$0, efx::cG);
   }

   @Nullable
   public StoredEntityType a(efw<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
      Optional<StoredEntityType> $$2 = this.c.right();
      if ($$2.isPresent()) {
         StoredEntityType $$3 = $$2.get();
         if (!$$3.dQ()) {
            return $$3;
         }

         this.c = Either.left($$3.cG());
      }

      Optional<UUID> $$4 = this.c.left();
      if ($$4.isPresent()) {
         StoredEntityType $$5 = this.a($$0.c($$4.get()), $$1);
         if ($$5 != null && !$$5.dQ()) {
            this.c = Either.right($$5);
            return $$5;
         }
      }

      return null;
   }

   @Nullable
   private StoredEntityType a(@Nullable efx $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cG());
   }

   public void a(tz $$0, String $$1) {
      $$0.a($$1, jz.a, this.c());
   }

   @Nullable
   public static <StoredEntityType extends efx> StoredEntityType a(
      @Nullable bwz<StoredEntityType> $$0, efw<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends efx> bwz<StoredEntityType> b(tz $$0, String $$1) {
      return $$0.<bwz<StoredEntityType>>a($$1, a()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends efx> bwz<StoredEntityType> a(tz $$0, String $$1, djx $$2) {
      Optional<UUID> $$3 = $$0.a($$1, jz.a);
      return $$3.isPresent() ? new bwz<>($$3.get()) : $$0.i($$1).map($$1x -> avr.a($$2.p(), $$1x)).map(bwz::new).orElse(null);
   }
}
