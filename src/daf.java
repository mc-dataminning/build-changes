import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record daf(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<daf> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.y.optionalFieldOf("name").forGetter(daf::c),
               kk.a.optionalFieldOf("id").forGetter(daf::d),
               azd.x.optionalFieldOf("properties", new PropertyMap()).forGetter(daf::e)
            )
            .apply($$0, daf::new)
   );
   public static final Codec<daf> a = Codec.withAlternative(g, azd.y, $$0 -> new daf(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zi<ByteBuf, daf> b = zi.a(zg.b(16).a(zg::a), daf::c, kk.g.a(zg::a), daf::d, zg.x, daf::e, daf::new);

   public daf(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public daf(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<daf> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dwf.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new daf($$1);
         }) : dwf.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ae.e, this.c.get()));
            return new daf($$1);
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
