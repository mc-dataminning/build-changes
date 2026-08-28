import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record dcy(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dcy> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.y.optionalFieldOf("name").forGetter(dcy::c),
               jz.a.optionalFieldOf("id").forGetter(dcy::d),
               ayw.x.optionalFieldOf("properties", new PropertyMap()).forGetter(dcy::e)
            )
            .apply($$0, dcy::new)
   );
   public static final Codec<dcy> a = Codec.withAlternative(g, ayw.y, $$0 -> new dcy(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yy<ByteBuf, dcy> b = yy.a(yw.b(16).a(yw::a), dcy::c, jz.g.a(yw::a), dcy::d, yw.y, dcy::e, dcy::new);

   public dcy(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dcy(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<dcy> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dzs.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new dcy($$1);
         }) : dzs.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ag.e, this.c.get()));
            return new dcy($$1);
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
