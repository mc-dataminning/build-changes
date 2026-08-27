import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cup(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cup> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(awu.u, "name").forGetter(cup::c), awu.a(jh.a, "id").forGetter(cup::d), awu.a(awu.t, "properties", new PropertyMap()).forGetter(cup::e)
            )
            .apply($$0, cup::new)
   );
   public static final Codec<cup> a = awu.a(g, awu.u, $$0 -> new cup(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yg<ByteBuf, cup> b = yg.a(ye.b(16).a(ye::a), cup::c, jh.g.a(ye::a), cup::d, ye.s, cup::e, cup::new);

   public cup(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cup(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cup> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : doa.a(this.c.orElseThrow()).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
         return new cup($$1);
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
