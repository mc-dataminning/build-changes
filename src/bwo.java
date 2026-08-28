import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwo<StoredEntityType extends efm> {
   private static final Codec<? extends bwo<?>> a = jz.a.xmap(bwo::new, bwo::c);
   private static final yw<ByteBuf, ? extends bwo<?>> b = jz.g.a(bwo::new, bwo::c);
   private Either<UUID, StoredEntityType> c;

   public static <Type extends efm> Codec<bwo<Type>> a() {
      return (Codec<bwo<Type>>)a;
   }

   public static <Type extends efm> yw<ByteBuf, bwo<Type>> b() {
      return (yw<ByteBuf, bwo<Type>>)b;
   }

   public bwo(StoredEntityType $$0) {
      this.c = Either.right($$0);
   }

   public bwo(UUID $$0) {
      this.c = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.c.map($$0 -> $$0, efm::cF);
   }

   @Nullable
   public StoredEntityType a(efl<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
      Optional<StoredEntityType> $$2 = this.c.right();
      if ($$2.isPresent()) {
         StoredEntityType $$3 = $$2.get();
         if (!$$3.dP()) {
            return $$3;
         }

         this.c = Either.left($$3.cF());
      }

      Optional<UUID> $$4 = this.c.left();
      if ($$4.isPresent()) {
         StoredEntityType $$5 = this.a($$0.c($$4.get()), $$1);
         if ($$5 != null && !$$5.dP()) {
            this.c = Either.right($$5);
            return $$5;
         }
      }

      return null;
   }

   @Nullable
   private StoredEntityType a(@Nullable efm $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cF());
   }

   public void a(tz $$0, String $$1) {
      $$0.a($$1, jz.a, this.c());
   }

   @Nullable
   public static <StoredEntityType extends efm> StoredEntityType a(
      @Nullable bwo<StoredEntityType> $$0, efl<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends efm> bwo<StoredEntityType> b(tz $$0, String $$1) {
      return $$0.<bwo<StoredEntityType>>a($$1, a()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends efm> bwo<StoredEntityType> a(tz $$0, String $$1, djm $$2) {
      Optional<UUID> $$3 = $$0.a($$1, jz.a);
      if ($$3.isPresent()) {
         return new bwo<>($$3.get());
      } else {
         String $$4 = $$0.j($$1);
         UUID $$5 = avp.a($$2.p(), $$4);
         return $$5 != null ? new bwo<>($$5) : null;
      }
   }
}
