import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cvd(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cvd> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(axe.u, "name").forGetter(cvd::c), axe.a(jp.a, "id").forGetter(cvd::d), axe.a(axe.t, "properties", new PropertyMap()).forGetter(cvd::e)
            )
            .apply($$0, cvd::new)
   );
   public static final Codec<cvd> a = axe.a(g, axe.u, $$0 -> new cvd(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yq<ByteBuf, cvd> b = yq.a(yo.b(16).a(yo::a), cvd::c, jp.g.a(yo::a), cvd::d, yo.s, cvd::e, cvd::new);

   public cvd(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cvd(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cvd> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : dop.a(this.c.orElseThrow()).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
         return new cvd($$1);
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
