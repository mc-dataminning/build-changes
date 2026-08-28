import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record czp(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<czp> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.y.optionalFieldOf("name").forGetter(czp::c),
               kl.a.optionalFieldOf("id").forGetter(czp::d),
               ayi.x.optionalFieldOf("properties", new PropertyMap()).forGetter(czp::e)
            )
            .apply($$0, czp::new)
   );
   public static final Codec<czp> a = Codec.withAlternative(g, ayi.y, $$0 -> new czp(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yn<ByteBuf, czp> b = yn.a(yl.b(16).a(yl::a), czp::c, kl.g.a(yl::a), czp::d, yl.x, czp::e, czp::new);

   public czp(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czp(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<czp> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dvp.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new czp($$1);
         }) : dvp.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(af.e, this.c.get()));
            return new czp($$1);
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
