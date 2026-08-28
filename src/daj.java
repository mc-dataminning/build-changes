import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record daj(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<daj> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.y.optionalFieldOf("name").forGetter(daj::c),
               kk.a.optionalFieldOf("id").forGetter(daj::d),
               azn.x.optionalFieldOf("properties", new PropertyMap()).forGetter(daj::e)
            )
            .apply($$0, daj::new)
   );
   public static final Codec<daj> a = Codec.withAlternative(g, azn.y, $$0 -> new daj(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zt<ByteBuf, daj> b = zt.a(zr.b(16).a(zr::a), daj::c, kk.g.a(zr::a), daj::d, zr.x, daj::e, daj::new);

   public daj(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public daj(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<daj> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dwe.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new daj($$1);
         }) : dwe.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ae.e, this.c.get()));
            return new daj($$1);
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
