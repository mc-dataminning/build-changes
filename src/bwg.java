import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwg<StoredEntityType extends eeh> {
   private Either<UUID, StoredEntityType> a;

   public static <Type extends eeh> Codec<bwg<Type>> a() {
      return jy.a.xmap(bwg::new, bwg::c);
   }

   public static <Type extends eeh> yu<ByteBuf, bwg<Type>> b() {
      return jy.g.a(bwg::new, bwg::c);
   }

   public bwg(StoredEntityType $$0) {
      this.a = Either.right($$0);
   }

   public bwg(UUID $$0) {
      this.a = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.a.map($$0 -> $$0, eeh::cG);
   }

   @Nullable
   public StoredEntityType a(eeg<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
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
   private StoredEntityType a(@Nullable eeh $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cG());
   }

   public void a(tx $$0, String $$1) {
      $$0.a($$1, this.c());
   }

   @Nullable
   public static <StoredEntityType extends eeh> StoredEntityType a(
      @Nullable bwg<StoredEntityType> $$0, eeg<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends eeh> bwg<StoredEntityType> b(tx $$0, String $$1) {
      return $$0.b($$1) ? new bwg<>($$0.a($$1)) : null;
   }

   @Nullable
   public static <StoredEntityType extends eeh> bwg<StoredEntityType> a(tx $$0, String $$1, dip $$2) {
      if ($$0.b($$1)) {
         return b($$0, $$1);
      } else {
         String $$3 = $$0.l($$1);
         UUID $$4 = avn.a($$2.p(), $$3);
         return $$4 != null ? new bwg<>($$4) : null;
      }
   }
}
