import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxp(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxp> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.w.optionalFieldOf("name").forGetter(cxp::c),
               kc.a.optionalFieldOf("id").forGetter(cxp::d),
               ayf.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxp::e)
            )
            .apply($$0, cxp::new)
   );
   public static final Codec<cxp> a = Codec.withAlternative(g, ayf.w, $$0 -> new cxp(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zm<ByteBuf, cxp> b = zm.a(zk.b(16).a(zk::a), cxp::c, kc.g.a(zk::a), cxp::d, zk.t, cxp::e, cxp::new);

   public cxp(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxp(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxp> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqr.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxp($$1);
         }) : dqr.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxp($$1);
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
