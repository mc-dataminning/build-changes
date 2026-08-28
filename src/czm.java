import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record czm(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<czm> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.y.optionalFieldOf("name").forGetter(czm::c),
               kl.a.optionalFieldOf("id").forGetter(czm::d),
               ayh.x.optionalFieldOf("properties", new PropertyMap()).forGetter(czm::e)
            )
            .apply($$0, czm::new)
   );
   public static final Codec<czm> a = Codec.withAlternative(g, ayh.y, $$0 -> new czm(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ym<ByteBuf, czm> b = ym.a(yk.b(16).a(yk::a), czm::c, kl.g.a(yk::a), czm::d, yk.x, czm::e, czm::new);

   public czm(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czm(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<czm> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dvm.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new czm($$1);
         }) : dvm.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(af.e, this.c.get()));
            return new czm($$1);
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
