import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cza(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cza> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.y.optionalFieldOf("name").forGetter(cza::c),
               kk.a.optionalFieldOf("id").forGetter(cza::d),
               ayt.x.optionalFieldOf("properties", new PropertyMap()).forGetter(cza::e)
            )
            .apply($$0, cza::new)
   );
   public static final Codec<cza> a = Codec.withAlternative(g, ayt.y, $$0 -> new cza(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zg<ByteBuf, cza> b = zg.a(ze.b(16).a(ze::a), cza::c, kk.g.a(ze::a), cza::d, ze.v, cza::e, cza::new);

   public cza(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cza(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cza> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dua.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cza($$1);
         }) : dua.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ae.e, this.c.get()));
            return new cza($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ae.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
