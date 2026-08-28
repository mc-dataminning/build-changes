import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record ddk(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<ddk> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.y.optionalFieldOf("name").forGetter(ddk::c),
               ka.a.optionalFieldOf("id").forGetter(ddk::d),
               azg.x.optionalFieldOf("properties", new PropertyMap()).forGetter(ddk::e)
            )
            .apply($$0, ddk::new)
   );
   public static final Codec<ddk> a = Codec.withAlternative(g, azg.y, $$0 -> new ddk(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ze<ByteBuf, ddk> b = ze.a(zc.b(16).a(zc::a), ddk::c, ka.g.a(zc::a), ddk::d, zc.y, ddk::e, ddk::new);

   public ddk(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public ddk(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<ddk> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? eae.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new ddk($$1);
         }) : eae.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ag.e, this.c.get()));
            return new ddk($$1);
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
