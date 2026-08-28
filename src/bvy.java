import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bvy<StoredEntityType extends edf> {
   private Either<UUID, StoredEntityType> a;

   public static <Type extends edf> Codec<bvy<Type>> a() {
      return km.a.xmap(bvy::new, bvy::c);
   }

   public static <Type extends edf> yt<ByteBuf, bvy<Type>> b() {
      return km.g.a(bvy::new, bvy::c);
   }

   public bvy(StoredEntityType $$0) {
      this.a = Either.right($$0);
   }

   public bvy(UUID $$0) {
      this.a = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.a.map($$0 -> $$0, edf::cG);
   }

   @Nullable
   public StoredEntityType a(ede<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
      Optional<StoredEntityType> $$2 = this.a.right();
      if ($$2.isPresent()) {
         StoredEntityType $$3 = $$2.get();
         if (!$$3.dQ()) {
            return $$3;
         }

         this.a = Either.left($$3.cG());
      }

      Optional<UUID> $$4 = this.a.left();
      if ($$4.isPresent()) {
         StoredEntityType $$5 = this.a($$0.c($$4.get()), $$1);
         if ($$5 != null && !$$5.dQ()) {
            this.a = Either.right($$5);
            return $$5;
         }
      }

      return null;
   }

   @Nullable
   private StoredEntityType a(@Nullable edf $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cG());
   }

   public void a(tw $$0, String $$1) {
      $$0.a($$1, this.c());
   }

   @Nullable
   public static <StoredEntityType extends edf> StoredEntityType a(
      @Nullable bvy<StoredEntityType> $$0, ede<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends edf> bvy<StoredEntityType> b(tw $$0, String $$1) {
      return $$0.b($$1) ? new bvy<>($$0.a($$1)) : null;
   }

   @Nullable
   public static <StoredEntityType extends edf> bvy<StoredEntityType> a(tw $$0, String $$1, dhp $$2) {
      if ($$0.b($$1)) {
         return b($$0, $$1);
      } else {
         String $$3 = $$0.l($$1);
         UUID $$4 = avm.a($$2.p(), $$3);
         return $$4 != null ? new bvy<>($$4) : null;
      }
   }
}
