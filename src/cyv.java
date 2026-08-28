import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cyv(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cyv> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.x.optionalFieldOf("name").forGetter(cyv::c),
               ki.a.optionalFieldOf("id").forGetter(cyv::d),
               ayo.w.optionalFieldOf("properties", new PropertyMap()).forGetter(cyv::e)
            )
            .apply($$0, cyv::new)
   );
   public static final Codec<cyv> a = Codec.withAlternative(g, ayo.x, $$0 -> new cyv(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zc<ByteBuf, cyv> b = zc.a(za.b(16).a(za::a), cyv::c, ki.g.a(za::a), cyv::d, za.v, cyv::e, cyv::new);

   public cyv(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cyv(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cyv> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dtj.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cyv($$1);
         }) : dtj.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ad.e, this.c.get()));
            return new cyv($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ad.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
