import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bvf<StoredEntityType extends eci> {
   private Either<UUID, StoredEntityType> a;

   public static <Type extends eci> Codec<bvf<Type>> a() {
      return kl.a.xmap(bvf::new, bvf::c);
   }

   public static <Type extends eci> yn<ByteBuf, bvf<Type>> b() {
      return kl.g.a(bvf::new, bvf::c);
   }

   public bvf(StoredEntityType $$0) {
      this.a = Either.right($$0);
   }

   public bvf(UUID $$0) {
      this.a = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.a.map($$0 -> $$0, eci::cF);
   }

   @Nullable
   public StoredEntityType a(ech<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
      Optional<StoredEntityType> $$2 = this.a.right();
      if ($$2.isPresent()) {
         StoredEntityType $$3 = $$2.get();
         if (!$$3.dP()) {
            return $$3;
         }

         this.a = Either.left($$3.cF());
      }

      Optional<UUID> $$4 = this.a.left();
      if ($$4.isPresent()) {
         StoredEntityType $$5 = this.a($$0.c($$4.get()), $$1);
         if ($$5 != null && !$$5.dP()) {
            this.a = Either.right($$5);
            return $$5;
         }
      }

      return null;
   }

   @Nullable
   private StoredEntityType a(@Nullable eci $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cF());
   }

   public void a(tq $$0, String $$1) {
      $$0.a($$1, this.c());
   }

   @Nullable
   public static <StoredEntityType extends eci> StoredEntityType a(
      @Nullable bvf<StoredEntityType> $$0, ech<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends eci> bvf<StoredEntityType> b(tq $$0, String $$1) {
      return $$0.b($$1) ? new bvf<>($$0.a($$1)) : null;
   }

   @Nullable
   public static <StoredEntityType extends eci> bvf<StoredEntityType> a(tq $$0, String $$1, dgz $$2) {
      if ($$0.b($$1)) {
         return b($$0, $$1);
      } else {
         String $$3 = $$0.l($$1);
         UUID $$4 = avc.a($$2.p(), $$3);
         return $$4 != null ? new bvf<>($$4) : null;
      }
   }
}
