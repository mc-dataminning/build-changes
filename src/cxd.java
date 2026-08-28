import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxd(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxd> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.w.optionalFieldOf("name").forGetter(cxd::c),
               kd.a.optionalFieldOf("id").forGetter(cxd::d),
               axo.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxd::e)
            )
            .apply($$0, cxd::new)
   );
   public static final Codec<cxd> a = Codec.withAlternative(g, axo.w, $$0 -> new cxd(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ys<ByteBuf, cxd> b = ys.a(yq.b(16).a(yq::a), cxd::c, kd.g.a(yq::a), cxd::d, yq.t, cxd::e, cxd::new);

   public cxd(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxd(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxd> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? drc.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxd($$1);
         }) : drc.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxd($$1);
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
