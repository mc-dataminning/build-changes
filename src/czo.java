import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record czo(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<czo> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.y.optionalFieldOf("name").forGetter(czo::c),
               kl.a.optionalFieldOf("id").forGetter(czo::d),
               ayi.x.optionalFieldOf("properties", new PropertyMap()).forGetter(czo::e)
            )
            .apply($$0, czo::new)
   );
   public static final Codec<czo> a = Codec.withAlternative(g, ayi.y, $$0 -> new czo(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ym<ByteBuf, czo> b = ym.a(yk.b(16).a(yk::a), czo::c, kl.g.a(yk::a), czo::d, yk.x, czo::e, czo::new);

   public czo(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czo(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<czo> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dvo.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new czo($$1);
         }) : dvo.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(af.e, this.c.get()));
            return new czo($$1);
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
