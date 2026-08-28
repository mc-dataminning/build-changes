import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record dau(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dau> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.y.optionalFieldOf("name").forGetter(dau::c),
               km.a.optionalFieldOf("id").forGetter(dau::d),
               ays.x.optionalFieldOf("properties", new PropertyMap()).forGetter(dau::e)
            )
            .apply($$0, dau::new)
   );
   public static final Codec<dau> a = Codec.withAlternative(g, ays.y, $$0 -> new dau(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yt<ByteBuf, dau> b = yt.a(yr.b(16).a(yr::a), dau::c, km.g.a(yr::a), dau::d, yr.x, dau::e, dau::new);

   public dau(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dau(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<dau> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dxb.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new dau($$1);
         }) : dxb.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(af.e, this.c.get()));
            return new dau($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(af.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
