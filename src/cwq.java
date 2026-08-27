import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cwq(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cwq> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.u.optionalFieldOf("name").forGetter(cwq::c),
               jr.a.optionalFieldOf("id").forGetter(cwq::d),
               axm.t.optionalFieldOf("properties", new PropertyMap()).forGetter(cwq::e)
            )
            .apply($$0, cwq::new)
   );
   public static final Codec<cwq> a = Codec.withAlternative(g, axm.u, $$0 -> new cwq(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final yv<ByteBuf, cwq> b = yv.a(yt.b(16).a(yt::a), cwq::c, jr.g.a(yt::a), cwq::d, yt.s, cwq::e, cwq::new);

   public cwq(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cwq(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cwq> a() {
      return this.b() ? CompletableFuture.completedFuture(this) : dps.a(this.c.orElseThrow()).thenApply($$0 -> {
         GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
         return new cwq($$1);
      });
   }

   private static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      GameProfile $$3 = new GameProfile($$1.orElse(ac.e), $$0.orElse(""));
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean b() {
      return this.d.isPresent() || !this.e.isEmpty() || this.c.isEmpty();
   }
}
