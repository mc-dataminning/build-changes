import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxk<StoredEntityType extends egj> {
   private static final Codec<? extends bxk<?>> a = ka.a.xmap(bxk::new, bxk::c);
   private static final ze<ByteBuf, ? extends bxk<?>> b = ka.g.a(bxk::new, bxk::c);
   private Either<UUID, StoredEntityType> c;

   public static <Type extends egj> Codec<bxk<Type>> a() {
      return (Codec<bxk<Type>>)a;
   }

   public static <Type extends egj> ze<ByteBuf, bxk<Type>> b() {
      return (ze<ByteBuf, bxk<Type>>)b;
   }

   public bxk(StoredEntityType $$0) {
      this.c = Either.right($$0);
   }

   public bxk(UUID $$0) {
      this.c = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.c.map($$0 -> $$0, egj::cG);
   }

   @Nullable
   public StoredEntityType a(egi<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
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
   private StoredEntityType a(@Nullable egj $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cG());
   }

   public void a(ua $$0, String $$1) {
      $$0.a($$1, ka.a, this.c());
   }

   @Nullable
   public static <StoredEntityType extends egj> StoredEntityType a(
      @Nullable bxk<StoredEntityType> $$0, egi<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends egj> bxk<StoredEntityType> b(ua $$0, String $$1) {
      return $$0.<bxk<StoredEntityType>>a($$1, a()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends egj> bxk<StoredEntityType> a(ua $$0, String $$1, dkj $$2) {
      Optional<UUID> $$3 = $$0.a($$1, ka.a);
      return $$3.isPresent() ? new bxk<>($$3.get()) : $$0.i($$1).map($$1x -> awa.a($$2.p(), $$1x)).map(bxk::new).orElse(null);
   }
}
