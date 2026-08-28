import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cys(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cys> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.x.optionalFieldOf("name").forGetter(cys::c),
               kh.a.optionalFieldOf("id").forGetter(cys::d),
               aym.w.optionalFieldOf("properties", new PropertyMap()).forGetter(cys::e)
            )
            .apply($$0, cys::new)
   );
   public static final Codec<cys> a = Codec.withAlternative(g, aym.x, $$0 -> new cys(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zb<ByteBuf, cys> b = zb.a(yz.b(16).a(yz::a), cys::c, kh.g.a(yz::a), cys::d, yz.u, cys::e, cys::new);

   public cys(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cys(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cys> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dtg.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cys($$1);
         }) : dtg.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ad.e, this.c.get()));
            return new cys($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ad.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
