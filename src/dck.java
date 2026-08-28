import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record dck(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dck> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.y.optionalFieldOf("name").forGetter(dck::c),
               jz.a.optionalFieldOf("id").forGetter(dck::d),
               ayu.x.optionalFieldOf("properties", new PropertyMap()).forGetter(dck::e)
            )
            .apply($$0, dck::new)
   );
   public static final Codec<dck> a = Codec.withAlternative(g, ayu.y, $$0 -> new dck(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yw<ByteBuf, dck> b = yw.a(yu.b(16).a(yu::a), dck::c, jz.g.a(yu::a), dck::d, yu.y, dck::e, dck::new);

   public dck(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dck(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<dck> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dzc.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new dck($$1);
         }) : dzc.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ag.e, this.c.get()));
            return new dck($$1);
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
