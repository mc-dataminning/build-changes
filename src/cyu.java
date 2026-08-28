import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cyu(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cyu> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.y.optionalFieldOf("name").forGetter(cyu::c),
               kj.a.optionalFieldOf("id").forGetter(cyu::d),
               ays.x.optionalFieldOf("properties", new PropertyMap()).forGetter(cyu::e)
            )
            .apply($$0, cyu::new)
   );
   public static final Codec<cyu> a = Codec.withAlternative(g, ays.y, $$0 -> new cyu(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zf<ByteBuf, cyu> b = zf.a(zd.b(16).a(zd::a), cyu::c, kj.g.a(zd::a), cyu::d, zd.v, cyu::e, cyu::new);

   public cyu(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cyu(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cyu> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dtu.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cyu($$1);
         }) : dtu.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ad.e, this.c.get()));
            return new cyu($$1);
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
