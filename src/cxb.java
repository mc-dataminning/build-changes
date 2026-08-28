import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public record cxb(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<cxb> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.w.optionalFieldOf("name").forGetter(cxb::c),
               kd.a.optionalFieldOf("id").forGetter(cxb::d),
               axm.v.optionalFieldOf("properties", new PropertyMap()).forGetter(cxb::e)
            )
            .apply($$0, cxb::new)
   );
   public static final Codec<cxb> a = Codec.withAlternative(g, axm.w, $$0 -> new cxb(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final ys<ByteBuf, cxb> b = ys.a(yq.b(16).a(yq::a), cxb::c, kd.g.a(yq::a), cxb::d, yq.t, cxb::e, cxb::new);

   public cxb(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxb(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   public CompletableFuture<cxb> a() {
      if (this.b()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? dqz.a(this.d.get()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(this.d.get(), this.c.orElse("")));
            return new cxb($$1);
         }) : dqz.a(this.c.orElseThrow()).thenApply($$0 -> {
            GameProfile $$1 = $$0.orElseGet(() -> new GameProfile(ac.e, this.c.get()));
            return new cxb($$1);
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
