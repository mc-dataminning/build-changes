import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cze(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cze> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.y.optionalFieldOf("name").forGetter(cze::c),
               kk.a.optionalFieldOf("id").forGetter(cze::d),
               ayw.x.optionalFieldOf("properties", new PropertyMap()).forGetter(cze::e)
            )
            .apply($$0, cze::new)
   );
   public static final Codec<cze> a = Codec.withAlternative(g, ayw.y, $$0 -> new cze(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zj<ByteBuf, cze> b = zj.a(zh.b(16).a(zh::a), cze::c, kk.g.a(zh::a), cze::d, zh.v, cze::e, cze::new);

   public cze(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cze(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cze> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? duf.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cze($$1);
         }) : duf.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ae.e, this.c.get()));
            return new cze($$1);
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
