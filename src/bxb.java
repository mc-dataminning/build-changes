import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxb<StoredEntityType extends efz> {
   private static final Codec<? extends bxb<?>> a = ka.a.xmap(bxb::new, bxb::c);
   private static final za<ByteBuf, ? extends bxb<?>> b = ka.g.a(bxb::new, bxb::c);
   private Either<UUID, StoredEntityType> c;

   public static <Type extends efz> Codec<bxb<Type>> a() {
      return (Codec<bxb<Type>>)a;
   }

   public static <Type extends efz> za<ByteBuf, bxb<Type>> b() {
      return (za<ByteBuf, bxb<Type>>)b;
   }

   public bxb(StoredEntityType $$0) {
      this.c = Either.right($$0);
   }

   public bxb(UUID $$0) {
      this.c = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.c.map($$0 -> $$0, efz::cG);
   }

   @Nullable
   public StoredEntityType a(efy<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
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
   private StoredEntityType a(@Nullable efz $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cG());
   }

   public void a(ua $$0, String $$1) {
      $$0.a($$1, ka.a, this.c());
   }

   @Nullable
   public static <StoredEntityType extends efz> StoredEntityType a(
      @Nullable bxb<StoredEntityType> $$0, efy<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends efz> bxb<StoredEntityType> b(ua $$0, String $$1) {
      return $$0.<bxb<StoredEntityType>>a($$1, a()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends efz> bxb<StoredEntityType> a(ua $$0, String $$1, djz $$2) {
      Optional<UUID> $$3 = $$0.a($$1, ka.a);
      return $$3.isPresent() ? new bxb<>($$3.get()) : $$0.i($$1).map($$1x -> avt.a($$2.p(), $$1x)).map(bxb::new).orElse(null);
   }
}
