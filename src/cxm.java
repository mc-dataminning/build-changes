import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxm(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxm> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.w.optionalFieldOf("name").forGetter(cxm::c),
               kc.a.optionalFieldOf("id").forGetter(cxm::d),
               ayc.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxm::e)
            )
            .apply($$0, cxm::new)
   );
   public static final Codec<cxm> a = Codec.withAlternative(g, ayc.w, $$0 -> new cxm(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zj<ByteBuf, cxm> b = zj.a(zh.b(16).a(zh::a), cxm::c, kc.g.a(zh::a), cxm::d, zh.t, cxm::e, cxm::new);

   public cxm(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxm(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxm> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqo.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxm($$1);
         }) : dqo.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxm($$1);
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
