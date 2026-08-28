import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxq(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxq> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.w.optionalFieldOf("name").forGetter(cxq::c),
               kc.a.optionalFieldOf("id").forGetter(cxq::d),
               ayg.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxq::e)
            )
            .apply($$0, cxq::new)
   );
   public static final Codec<cxq> a = Codec.withAlternative(g, ayg.w, $$0 -> new cxq(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zm<ByteBuf, cxq> b = zm.a(zk.b(16).a(zk::a), cxq::c, kc.g.a(zk::a), cxq::d, zk.t, cxq::e, cxq::new);

   public cxq(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxq(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxq> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqs.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxq($$1);
         }) : dqs.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxq($$1);
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
