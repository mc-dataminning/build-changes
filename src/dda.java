import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record dda(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dda> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.y.optionalFieldOf("name").forGetter(dda::c),
               ka.a.optionalFieldOf("id").forGetter(dda::d),
               ayy.x.optionalFieldOf("properties", new PropertyMap()).forGetter(dda::e)
            )
            .apply($$0, dda::new)
   );
   public static final Codec<dda> a = Codec.withAlternative(g, ayy.y, $$0 -> new dda(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final za<ByteBuf, dda> b = za.a(yy.b(16).a(yy::a), dda::c, ka.g.a(yy::a), dda::d, yy.y, dda::e, dda::new);

   public dda(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dda(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<dda> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dzu.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new dda($$1);
         }) : dzu.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ag.e, this.c.get()));
            return new dda($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ag.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
