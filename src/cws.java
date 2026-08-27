import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cws(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cws> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.u.optionalFieldOf("name").forGetter(cws::c),
               jr.a.optionalFieldOf("id").forGetter(cws::d),
               axn.t.optionalFieldOf("properties", new PropertyMap()).forGetter(cws::e)
            )
            .apply($$0, cws::new)
   );
   public static final Codec<cws> a = Codec.withAlternative(g, axn.u, $$0 -> new cws(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yv<ByteBuf, cws> b = yv.a(yt.b(16).a(yt::a), cws::c, jr.g.a(yt::a), cws::d, yt.s, cws::e, cws::new);

   public cws(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cws(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cws> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dpu.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cws($$1);
         }) : dpu.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cws($$1);
         });
      }
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ac.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }
}
