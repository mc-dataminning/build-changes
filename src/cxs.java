import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxs(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxs> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(axu.v, "name").forGetter(cxs::c), axu.a(ju.a, "id").forGetter(cxs::d), axu.a(axu.u, "properties", new PropertyMap()).forGetter(cxs::e)
            )
            .apply($$0, cxs::new)
   );
   public static final Codec<cxs> a = axu.a(g, axu.v, $$0 -> new cxs(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zc<ByteBuf, cxs> b = zc.a(za.b(16).a(za::a), cxs::c, ju.g.a(za::a), cxs::d, za.t, cxs::e, cxs::new);

   public cxs(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxs(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxs> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : drt.a(this.c.orElseThrow()).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ad.e, this.c.get()));
         return new cxs($$1);
      });
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ad.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return this.d.isPresent() || !this.e.isEmpty() || this.c.isEmpty();
   }
}
