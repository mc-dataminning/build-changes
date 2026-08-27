import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cvz(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cvz> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(axh.u, "name").forGetter(cvz::c), axh.a(jq.a, "id").forGetter(cvz::d), axh.a(axh.t, "properties", new PropertyMap()).forGetter(cvz::e)
            )
            .apply($$0, cvz::new)
   );
   public static final Codec<cvz> a = axh.a(g, axh.u, $$0 -> new cvz(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ys<ByteBuf, cvz> b = ys.a(yq.b(16).a(yq::a), cvz::c, jq.g.a(yq::a), cvz::d, yq.s, cvz::e, cvz::new);

   public cvz(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cvz(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cvz> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : doy.a(this.c.orElseThrow()).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
         return new cvz($$1);
      });
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ac.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return this.d.isPresent() || !this.e.isEmpty() || this.c.isEmpty();
   }
}
